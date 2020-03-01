package Zad1;

import java.util.Scanner;

/*
Summary: Print flag into console
Author: Mateusz Hinca
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj rozmiar flagi small,medium,large:");
        int size = ResolveFlagSize(GetInformationAboutFlag());
        PrintPolishFlag(size);
        System.out.println();
        System.out.println();
        PrintJapanFlag(size);
    }

    public static void PrintPolishFlag(int flagSize) {
        PrintFlagBorderTop(flagSize);
        for (int i = 0; i < flagSize / 4; i++) {
            System.out.println();
            for (int j = 0; j < flagSize * 3; j++) {
                if (j == 0 || j == (flagSize * 3) - 1) {
                    System.out.print('|');
                } else
                    System.out.print(' ');
            }
        }
        for (int i = 0; i < flagSize / 4; i++) {
            System.out.println();
            for (int j = 0; j < flagSize * 3; j++) {
                if (j == 0 || j == (flagSize * 3) - 1) {
                    System.out.print('|');
                } else
                    System.out.print(':');
            }
        }
        System.out.println();
        PrintFlagBorderTop(flagSize);
    }

    public static void PrintJapanFlag(int flagSize) {
        PrintFlagBorderTop(flagSize);
        int width = flagSize/2;
        int length = (int) (width * 3);
        int y = width;
        while (y >= - width) {
            System.out.println();
            for(int x = -length;x<=length;x++){
                if((Math.sqrt(x*x + y*y)) >= width-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            y -= 2;

        }
        System.out.println();
        PrintFlagBorderTop(flagSize);
    }

    public static void PrintFlagBorderTop(int flagSize) {
        for (int i = 0; i < flagSize * 3; i++) {
            System.out.print("-");
        }
    }

    public static int ResolveFlagSize(String sizeName) {
        int size = 0;
        switch (sizeName.toLowerCase()) {
            case "small":
                size = 16;
                break;
            case "medium":
                size = 32;
                break;
            case "large":
                size = 64;
                break;
            default:
                size = 16;
        }
        return size;
    }

    public static String GetInformationAboutFlag() {
        return scanner.nextLine();
    }
}
