package com.juhuyoon;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = Math.round((kiloBytes / 1024));
            int modulo = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB " + " = " + megabytes + " MB and " + modulo + " KB");
        }

    }
}
