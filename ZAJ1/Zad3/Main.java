package Zad3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your weight (kg):");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Your height (cm):");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Your age (years):");
        double age = Double.parseDouble(scanner.nextLine());
        System.out.println("Your gender(f/m):");
        String gender =scanner.nextLine();
        System.out.print("Your bmr: ");
        double bmr = 0;
        if (gender.charAt(0)=='m') {
            bmr = 66.5 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
        } else {
            bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
        }
        System.out.print(bmr);
    }
}
