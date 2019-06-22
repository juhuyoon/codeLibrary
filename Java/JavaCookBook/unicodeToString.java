Stringbuffer b = new Stringbuffer();

for(char c = 'a'; c < 'd'; c++) {
  b.append(c);
}
b.append('\u00a5'); //Yen
b.append('\u01FC'); // Roman AE
b.append('\u0391'); // Greek Capital Alpha
b.append('\u03A9'); // Greek Capital Omega

for(int i = 0; i < b.length; i++) {
  System.out.printf("Character #%d (%04x) is %c%n', i, (int)b.charAt(i), b.charAt(i)");
};

System.out.println("Accumulated characters are " + b);

