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