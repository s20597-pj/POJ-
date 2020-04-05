package Zad4;

import java.util.Scanner;

/*
Summary: Print tower of chars
Author: Mateusz Hinca
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Size of tower");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) ((j % 26) + 97));
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ((j % 26) + 97));
            }
            System.out.println();
        }
    }

}
