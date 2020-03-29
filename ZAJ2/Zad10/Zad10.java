import java.util.Arrays;
import java.util.Scanner;

/*
Summary: The Gift
Author: Mateusz Hinca
 */

//THE GOAL
//The Oods want to offer a present to one of them. The thing is, they all have different budgets to invest in this present.
// Of course, their unique wish is to find the fairest method that will determine the maximum budget that each Ood can afford.
// The Oods have been discussing this issue for days, and up until now, they have not managed to find a totally satisfactory solution.
//
//The Doctor decides to give a helping hand by creating a program.
// His idea is to check if the Oods have enough money to buy the present,
// and if so, to calculate how much each Ood should pay, according to their respective budget limit.


//CODE TO PASS ALL TESTS


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int C = in.nextInt();
        int[] budgets = new int[N];
        int[] howMuch = new int[N];
        boolean isAllBudgetUsed = true;
        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            budgets[i] = B;
            howMuch[i] = 0;
        }
        int allBudgetUsed = 0;
        int tmpC = C;

        do {
            allBudgetUsed = 0;
            for (int i = 0; i < N; i++) {
                if (tmpC <= 0) {
                    allBudgetUsed = N;
                    isAllBudgetUsed = false;
                } else {
                    if (howMuch[i] < budgets[i]) {
                        howMuch[i] = howMuch[i] + 1;
                        tmpC = tmpC - 1;
                    } else {
                        allBudgetUsed = allBudgetUsed + 1;
                    }
                }

            }
        }
        while (allBudgetUsed != N);


        Arrays.sort(howMuch);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if (isAllBudgetUsed) {
            System.out.println("IMPOSSIBLE");
        } else {
            for (int i = 0; i < N; i++) {
                System.out.println(howMuch[i]);
            }
        }
    }
}