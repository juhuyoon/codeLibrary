import java.util.*;

public class SortTimings {
	Random random = new Random();
	
	private String makeString(int size){
		StringBuilder sb = new StringBuilder();
		String alph = "abcdefghijklmnopqrstuvwxyz";
		for(int k=0; k < size; k++){
			sb.append(alph.charAt(random.nextInt(alph.length())));
		}
		return sb.toString();
	}
	
	public ArrayList<String> makeRandomList(int wordSize, int size){
		ArrayList<String> list = new ArrayList<String>();
		for(int k=0; k < size; k++){
			list.add(makeString(wordSize));
		}
		return list;
	}
	
	public void bubbleSort(ArrayList<String> list){
		for(int k=0; k < list.size(); k++) {
			for(int j=0; j < list.size()-k-1; j++) {
				if (list.get(j).compareTo(list.get(j+1)) > 0) {
					Collections.swap(list, j,j+1);
				}
			}
		}
	}
	
	public void selectSort(String[] list) {
	    for(int k=0; k < list.length; k++){
			int mindex = k;
			//Cannot use </> to compare anything in Java other than primitive types such as int, char, and double
			//For object and other complicated types like strings. 
			//SO we use the compareTo, which works with organizing the strings here in alphabetical order. 
			for(int j=k+1; j < list.length; j++){
				if (list[j].compareTo(list[mindex]) < 0){
					mindex = j;
				}
			}
			String temp = list[k];
			list[k] = list[mindex];
			list[mindex] = temp;
		}
	}
	
	public void selectSort(ArrayList<String> list) {
		for(int k=0; k < list.size(); k++){
			int mindex = k;
			for(int j=k+1; j < list.size(); j++){
				if (list.get(j).compareTo(list.get(mindex)) < 0) {
					mindex = j;
				}
			}
			Collections.swap(list, k, mindex);
		}
	}
	
	public boolean isSorted(ArrayList<String> list) {
		for(int k=1; k < list.size(); k++){
			if (list.get(k).compareTo(list.get(k-1)) < 0) {
				return false;
			}
		}
		return true;
	}
	
	public void timer(int start, int stop, int increment, int trials) {
		for(int k=start; k <= stop; k += increment) {
			ArrayList<String> list = makeRandomList(10,k);

		    double begin = System.nanoTime();
			for(int j=0; j < trials; j++) {
				ArrayList<String> copy = new ArrayList<String>(list);
				selectSort(copy);
				if (! isSorted(copy)) {
					System.out.println("trouble on sorted select "+k);
				}
			}	
			double end = System.nanoTime();
			double stime = (end-begin)/1e9/trials;
			begin = System.nanoTime();
			for(int j=0; j < trials; j++) {
				ArrayList<String> copy = new ArrayList<String>(list);
				Collections.sort(copy);;
				if (! isSorted(copy)) {
					System.out.println("trouble on sorted tim "+k);
				}
			}	
			end = System.nanoTime();
			double ttime = (end-begin)/1e9/trials;
			System.out.printf("%d\t%3.2f\t%3.2f\n",k,stime,ttime);
		}
	}
	
	public void runSelect(){
	    String[] cats = {"tiger", "lion", "cheetah", "puma", "leopard"};
	    selectSort(cats);
	    for(String s : cats){
	        System.out.println(s);
	    }
	}

	//to see the efficiency of the sortings
	public void runner(){
		timer(10000,100000,10000,2);
	}

}

