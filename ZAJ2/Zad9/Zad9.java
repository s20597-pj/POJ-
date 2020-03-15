/*
Summary: Power of thor
Author: Mateusz Hinca
 */

//THE GOAL
//Your program must allow Thor to reach the light of power.


//CODE TO PASS ALL TESTS
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        
        int currentTx = initialTx;
        int currentTy=initialTy;
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String direction="";
            if(currentTy>lightY){
            direction +="N";
            currentTy--;
            }
            else if(currentTy<lightY){
                direction+= "S";
                 currentTy++;
            }
            if(currentTx<lightX){
                  direction +="E";
                  currentTx++;
            }
            else if(currentTx>lightX){
                    direction +="W";
                  currentTx--;
                }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
