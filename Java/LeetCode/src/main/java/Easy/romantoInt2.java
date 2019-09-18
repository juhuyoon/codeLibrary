package Easy;

class romanToInt2 {
  public int romanToInt(String input) {
    int sum = 0;
    int n = 0;

    for(int i = input.length() -1; i >= 0; i--) {
      int m = 0;

      switch(input.charAt(i)) {
        case 'I': m = 1; break;
        case 'V': m = 5; break;
        case 'X': m = 10; break;
        case 'L': m = 50; break;
        case 'C': m = 100; break;
        case 'D': m = 500; break;
        case 'M': m = 1000; break;
      }
      if(m < n) {
        sum -= m;
      } else {
        sum += m;
      }
      n = m;
    }
    return sum;
  }
}