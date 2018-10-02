public void dnaFingerPrint(String s) {
    int cc = 0, cg = 0, ca = 0, ct = 0;

    for(int i = 0; i < s.length; i++) {
        char ch = s.charAt(i);
        if(ch == 'c') {
            cc += 1;
        } else if (ch == 'g') {
            cg += 1;
        } else if (ch == 'a') {
            ca += 1;
        } else if (ch == 't') {
            ct += 1;
        }
    }
} //works to count down the 4 specific characters, BUT it's hard to scale, as it would have to run through every 26 letters every time to search
