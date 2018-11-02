class RaindropConverter {
    //using ternary operator 
    String convert(int number) {
       StringBuilder result = new StringBuilder();
       result.append(number % 3 == 0 ? "Pling" : "");
       result.append(number % 5 == 0 ? "Plang" : "");
       result.append(number % 7 == 0 ? "Plong" : "");

       result = result.length() == 0 ? result.append(number) : result;
       return result.toString();
}
}
