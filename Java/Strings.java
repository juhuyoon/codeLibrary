//Strings are immutable in java, once built they cannot be changed
//If you want a different string, you must make a new one with that change. 
//building strings many times is very slow and inefficient

    
String s = "blue"; 
String m = s + "moon"; 
s = s + m; 
m = "low" + s;
//S = bluebluemoon, m = lowbluebluemoon


//So, it is recommended to use StringBuilder. 
    //mutable sequence of characters, but can be modified. 
    StringBuilder sb = new StringBuilder("hello");
    sb.append("World") //result = hello World

    .append(),
    .insert(),
    .charAt(),
    .setCharAt(),
    .toString()


//Difference between using StringBuilder and String
    

StringBuilder sb = new StringBuilder("start");
sb.insert(4,"le");
System.out.println(sb);


//With no StringBuilder
String s = "start"; 
s = s.substring(0,4) + "le" + s.substring(4);
System.out.println(s); 

//reversing a string with Java:
public String reverse(String s) {
    String ret = "";
    for(int i = 0; i < s.length; i+= 1) {
        ret = s.charAt(i) + ret; //this will go in reverse as the next character will appear before the previously placed ret character.
    }
    return ret;
}


//Char Building
//type char is primitive with single quotes:
"a" = String

//several methods:
.isLowerCase(ch) //returns boolean if ch is a letter 'a'
.isDigit(ch) //returns boolean if it's a number or not '1'
.toLowerCase(ch) //returns lowercase
.toUpperCase(ch) //returns uppercase

//using array as an indexed collection:
StorageResource //to collect strings
//useful, but limited. 
//define array with []
int[] a = new int[256] //specifying the specific array storage size
for(int i = 0; i < a.length; i++) {
    int val = a[i];
}
//Indexed collection of elements/values and it reads and writes via indexes
int[] x; //no storage, just a type
int[] x = new int[12]; //all initialized to zero, to say how many are stored
String[] s = new String[12]; //all initialized to null. 

//read and write:
s[3] = "Hello"; //storing
 x[2] = x[3] + 4; //access and reading an array location like this. 
//storage allocated and doesn't change. 

//arr.length - find the number of elements in an array

//equality
    //Two types of equality:
        //1) == : same exact object
        //2) .equals() : same meaning
            //Defined by class: default == `