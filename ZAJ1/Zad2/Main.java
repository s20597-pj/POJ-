package Zad2;

import java.util.Scanner;
/*
Summary: BMI Calculator
Author: Mateusz Hinca
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's calculate your BMI");
        System.out.println("Your weight (kg):");
        int weight=Integer.parseInt(scanner.nextLine());
        System.out.println("Your height (cm):");
        double height=Integer.parseInt(scanner.nextLine());
        double powHeight = (height/100*height/100);
        double bmi = weight/powHeight;
        System.out.printf("Your bmi: ");
        System.out.println(bmi);
        System.out.print("Your bmi interpretation: ");
        bmiInterpretation(bmi);
    }
    public static void bmiInterpretation(double bmi){
        if(bmi>=40) System.out.print("Class III Obesity");
        if(bmi>=35) System.out.print("Class II Obesity");
        if(bmi>=30) System.out.print("Class I Obesity");
        if(bmi>=25) System.out.print("Overweight");
        if(bmi>=18.5) System.out.print("Normal weight");
        if(bmi<18.5) System.out.print("Below normal weight");
    }
}
