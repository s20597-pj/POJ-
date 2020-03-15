package Zad7;

/**
 * summary: Triangle class
 * author: Mateusz Hinca
 **/

public class Triangle {
    private double baseOfTriangle;
    private double side1;
    private double side2

    public Rectangle(double baseOfTriangle, double side1, double side2) {
        this.baseOfTriangle = baseOfTriangle;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calcField() {
        double halfOfCircuit = calcCircuit() / 2;
        return Math.sqrt(halfOfCircuit * (halfOfCircuit - baseOfTriangle) * (halfOfCircuit - side1) * (halfOfCircuit - side2))
    }

    public double calcCircuit() {
        return baseOfTriangle + side1 + side2;
    }

    public boolean isEquilateral() {
        return side1 == side2 && side1 == baseOfTriangle;
    }

    public boolean isScalene() {
        return side1 != side2 && side1 != baseOfTriangle && side2 != baseOfTriangle;
    }

    public boolean isIsosceles() {
        return side1 == side2 && side1 != baseOfTriangle;
    }
}