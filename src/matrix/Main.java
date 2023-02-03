package matrix;

import java.io.Console;


public class Main{
    public static void main(String[] args){

         // Get the console
         Console cons = System.console();

         // Number of equations and terms for matrix 1
         int eqnCount1 = Integer.parseInt(cons.readLine("Number of equations for M1: "));
         int terms1 = Integer.parseInt(cons.readLine("Number of terms per equation for M1: "));

        // Number of equations and terms for matrix 2
        int eqnCount2 = Integer.parseInt(cons.readLine("Number of equations for M2: "));
        int terms2 = Integer.parseInt(cons.readLine("Number of terms per equation for M2: "));

        if (terms1 != eqnCount2){
            System.out.println("Unable to perform matrix multiplication as the order is incorrect.");
            return;
    
        }
 
         // create matrix 1
         int[][] matrixOne = new int[eqnCount1][terms1];

        // create matrix 2
        int[][] matrixTwo = new int[eqnCount2][terms2];
 
         //resultant matrix has eqnCount number of rows
         int[][] resultant = new int[eqnCount1][terms2];

         //To store user input for each row
         String inputEquation;
         //to store array where spaces are removed. 
         String[] arraySpaceRemoved;
 
         // Read the equations
         int i = 0;
         int j = 0;
         int Prod = 0;
 
         //array.length reads the number of rows when in 2d.
         //can be done with for loop
        //Elements for matrixOne
         while (i < matrixOne.length) {
             // Read a line
             inputEquation = cons.readLine("Equation for matrixOne (%d): ", i + 1);
             // Split the line by a single white space
             //Stored in array combs
             arraySpaceRemoved = inputEquation.split(" ");

             // Convert the string into integer
             j = 0;
             while (j < matrixOne[i].length) {
                 matrixOne[i][j] = Integer.parseInt(arraySpaceRemoved[j]);
                 System.out.printf("%d\n", matrixOne[i][j]);
                 j += 1;
             }
             i += 1;
         }

         //Elements for matrixTwo
         int k = 0;
         int l = 0;
         while (k < matrixTwo.length) {
            // Read a line
            inputEquation = cons.readLine("Equation for matrixTwo (%d): ", k + 1);
            // Split the line by a single white space
            //Stored in array combs
            arraySpaceRemoved = inputEquation.split(" ");

            // Convert the string into integer
            l = 0;
            while (l < matrixTwo[k].length) {
                matrixTwo[k][l] = Integer.parseInt(arraySpaceRemoved[l]);
                System.out.printf("%d\n", matrixTwo[k][l]);
                l += 1;
            }
            k += 1;
        }
 
 
         // Perform the matrix multiplication
         i = 0;
         l = 0;
         while (i < matrixOne.length) {
             j = 0;
             k = 0;
             //initial value of Prod is zero as not calculated yet. 
             Prod = 0;
             while (j < matrixOne[i].length) {
            // while (k < matrixTwo[k].length) {
                 Prod += matrixOne[i][j] * matrixTwo[k][l];
                 j++;
                //  resultant[i][l] = Prod;
                 k++;
                 resultant[i][l] = Prod;
             }
             i++;
             l++;
         }
 
        System.out.println("The matrix product is ");
        i = 0;
        while (i < resultant.length) {
            l = 0;
            while ( l < resultant[i].length){
              System.out.printf("%d\n", resultant[i][l]);
           l++;
          }
        i++;
        }  
     
    }


}