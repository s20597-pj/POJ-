package com.company;

import java.util.Scanner;
/*
Summary: Print flag into console
Author: Mateusz Hinca
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PrintPolishFlag(ResolveFlagSize(GetInformationAboutFlag()));
    }

    public static void PrintPolishFlag(int flagSize) {
        PrintFlagBorderTop(flagSize);
        for(int i=0;i<flagSize/2;i++){
            System.out.println();
            for(int j=0;j<flagSize*3;j++){
                System.out.print(' ');
            }
        }
        for(int i=0;i<flagSize/2;i++){
            System.out.println();
            for(int j=0;j<flagSize*3;j++){
                System.out.print(':');
            }
        }
    }
    public static void PrintFlagBorderTop(int flagSize){
        for(int i=0;i<flagSize*3;i++){
            System.out.print("_");
        }
    }
    public static int ResolveFlagSize(String sizeName) {
        int size = 0;
        switch (sizeName.toLowerCase()) {
            case "small":
                size = 4;
                break;
            case "medium":
                size = 8;
                break;
            case "large":
                size = 16;
                break;
            default:
                size = 4;
        }
        return size;
    }

    public static String GetInformationAboutFlag() {
        return scanner.nextLine();
    }
}
