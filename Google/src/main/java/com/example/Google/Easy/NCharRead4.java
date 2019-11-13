package com.example.Google.Easy;

public class NCharRead4 {
    // Will extend Reader4
    private int buffPtr = 0;
    private int buffCnt = 0;

    private char[] buff = new char[4];
    public int read(char[] buff, int n) {
        int ptr = 0;
        while(ptr < n) {
            if(buffPtr == 0) {
                //buffCnt = read4(buff);
            }
            if(buffCnt == 0) {
                break;
            }
            while(ptr < n && buffPtr < buffCnt) {
                buff[ptr++] = buff[buffPtr++];
            }
            if(buffPtr >= buffCnt) {
                buffPtr = 0;
            }
        }
        return ptr;
    }
}
