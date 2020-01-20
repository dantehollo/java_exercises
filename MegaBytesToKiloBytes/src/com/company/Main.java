package com.company;

public class Main {

    public static void main(String[] args) {
        class MegaBytesToKiloBytes {
            public void printMegaBytesAndKiloBytes(int kiloBytes){
                if (kiloBytes < 0){
                    System.out.println("Invalid Value");
                }
                double convertMegaBytesToKiloBytes = kiloBytes / 1024d;
                System.out.println(convertMegaBytesToKiloBytes);
            }
        }
    }
}
