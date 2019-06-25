String sh = "FCGDAEB";
System.out.println(sh + " -> " + new StringBuilder(sh).reverse());

String s = "Father Charles Goes Down And Ends Battle";

//Put it in the stack frontwards
Stack<String> myStack = new Stack<>();
StringTokenizer st = new StringTokenizer(s);

while(st.hasMoreTokens()) {
  myStack.push(st.nextToken());
}

//Print the stack backwards
System.out.print('"' + s + '"' + " backwards by word is: \n\t");
while(!myStack.empty()) {
  System.out.print(myStack.pop());
  System.out.print(' ');
}
System.out.println('"');

