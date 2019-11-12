package com.example.Google.Easy;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int a = num1.length();
        int b = num2.length();
        int[] pos = new int[a + b];

        for(int i = (a-1); i >= 0; i--) {
            for(int j = (b-1); j >=0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : pos) {
            if(!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
