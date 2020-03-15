package Zad6;

/**
 * summary: Rectangle class
 * author: Mateusz Hinca
 **/

public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double calcField(){
        return length*width;
    }
    public double calcCircuit(){
        return 2*length+2*width;
    }
    public double calcDiagonal(){
        return Math.sqrt((width*width)+(length*length))
    }
}