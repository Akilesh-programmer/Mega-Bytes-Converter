package com.akilesh;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB

        int megaBytes;
        int remainingKiloBytes;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            megaBytes = kiloBytes / 1024; // gives double, but if sliced we get appropriate MB, remaining KB can be
                                          // calculated afterwards.
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
