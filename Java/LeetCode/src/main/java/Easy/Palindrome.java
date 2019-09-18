package Easy;

class isPalindrome {
  public boolean isPalindrome(int input) {
    if(input < 0) {
      return false;
    }
    int reversedNumber = 0;
    int remainder = 0;
    int originalNumber = input;
    
    while(input > 0) {
      remainder = input % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      input = input / 10;
    }

    //this was because we took the input and divided by 10. 
    return originalNumber == input;
  }
}