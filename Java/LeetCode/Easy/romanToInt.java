class Solution {
  public int romanToInt(String s) {
      int sum = 0;
      int highest = -1;
      for(int i = s.length()-1; i >=0; i--) {
          int current = converter(s.charAt(i));
          highest = Math.max(highest, current);
          if(current < highest) {
              sum -= current;
          } else {
              sum += current;
          }
      }
          return sum;

}
  
  int converter(char c) {
      switch(c) {
          case 'I': 
              return 1;
              
          case 'V':
              return 5;
              
          case 'X':
              return 10;
              
          case 'L':
              return 50;
              
          case 'C':
              return 100;
              
          case 'D':
              return 500;
              
          case 'M':
              return 1000;
              
          default:
              return 0;
                       
      }
  }
}