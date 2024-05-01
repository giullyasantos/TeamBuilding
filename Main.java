/* COP 3503C Assignment 6
This program is written by: Giullya Santos */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
    
            int[] firstRow = new int[n];
            int[] secondRow = new int[n];
            
            //read number of problems solved by students
            for (int i = 0; i < n; i++)
                firstRow[i] = scanner.nextInt();
           
            for (int i = 0; i < n; i++)
                secondRow[i] = scanner.nextInt();
    
            int[][] maxProblems = new int[2][n];
            maxProblems[0][0] = firstRow[0];
            maxProblems[1][0] = secondRow[0];
            
            /*maximize problems solved by the ith student in the first row,
              alternating rows and considering the previous best scores.*/
            for (int i = 1; i < n; i++) {
                maxProblems[0][i] = firstRow[i] + (i > 1 ? Math.max(maxProblems[1][i - 1], maxProblems[1][i - 2]) : maxProblems[1][i - 1]);
                maxProblems[1][i] = secondRow[i] + (i > 1 ? Math.max(maxProblems[0][i - 1], maxProblems[0][i - 2]) : maxProblems[0][i - 1]);
            }
    
            //max value at the last student of either section
            int answer = Math.max(maxProblems[0][n - 1], maxProblems[1][n - 1]);
            System.out.println(answer);
            scanner.close();
            
        }catch(Exception e) {}
    }
}
