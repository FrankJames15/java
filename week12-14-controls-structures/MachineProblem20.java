/*
    20. Write a program that accepts an input grade in percentile form
    and output its grade equivalent based on the given range of percentile
    and grade equivalent table below:
        RANGE       GRADE
        98-100      1.00
        95-97       1.25
        92-94       1.50
        89-91       1.75
        85-88       2.00
        82-84       2.25
        80-81       2.50
        77-79       2.75
        75-76       3.00
        Below 75    OUT OF RANGE
*/

import java.io.*;

public class MachineProblem20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter grade in percentile form: ");
        int grade = Integer.parseInt(br.readLine());

        if (grade >= 98 && grade <= 100) {
            System.out.println("1.00");
        } else if (grade >= 95 && grade <= 97) {
            System.out.println("1.25");
        } else if (grade >= 92 && grade <= 94) {
            System.out.println("1.50");
        } else if (grade >= 89 && grade <= 91) {
            System.out.println("1.75");
        } else if (grade >= 85 && grade <= 88) {
            System.out.println("2.00");
        } else if (grade >= 82 && grade <= 84) {
            System.out.println("2.25");
        } else if (grade >= 80 && grade <= 81) {
            System.out.println("2.50");
        } else if (grade >= 77 && grade <= 79) {
            System.out.println("2.75");
        } else if (grade >= 75 && grade <= 76) {
            System.out.println("3.00");
        } else {
            System.out.println("OUT OF RANGE");
        }
    }
}
