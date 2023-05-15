/*
    21. Write a program to accept a grade and then display the equivalent
    grade on a class card based on the given range of grades.

        GRADE           CLASS CARD GRADE
        98-100          1.00
        95-97           1.25
        92-94           1.50
        89-91           1.75
        85-88           2.00
        82-84           2.25
        80-81           2.50
        77-79           2.75
        75-76           3.00
        70-74           4.00
        Below 70        5.00

    This program is also designed to compute for the total grades based on
    the prelim grades, midterm grades and final grades. Total grade is equal to
    30% of prelims, 30% of midterm and 40% of finals.
*/

import java.io.*;

public class MachineProblem21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter prelim grade: ");
        double prelim = Double.parseDouble(br.readLine());

        System.out.print("Enter midterm grade: ");
        double midterm = Double.parseDouble(br.readLine());

        System.out.print("Enter final grade: ");
        double finalGrade = Double.parseDouble(br.readLine());

        double totalGrade = (prelim * 0.3) + (midterm * 0.3) + (finalGrade * 0.4);

        if (totalGrade >= 98 && totalGrade <= 100) {
            System.out.println("1.00");
        } else if (totalGrade >= 95 && totalGrade <= 97) {
            System.out.println("1.25");
        } else if (totalGrade >= 92 && totalGrade <= 94) {
            System.out.println("1.50");
        } else if (totalGrade >= 89 && totalGrade <= 91) {
            System.out.println("1.75");
        } else if (totalGrade >= 85 && totalGrade <= 88) {
            System.out.println("2.00");
        } else if (totalGrade >= 82 && totalGrade <= 84) {
            System.out.println("2.25");
        } else if (totalGrade >= 80 && totalGrade <= 81) {
            System.out.println("2.50");
        } else if (totalGrade >= 77 && totalGrade <= 79) {
            System.out.println("2.75");
        } else if (totalGrade >= 75 && totalGrade <= 76) {
            System.out.println("3.00");
        } else if (totalGrade >= 70 && totalGrade <= 74) {
            System.out.println("4.00");
        } else {
            System.out.println("5.00");
        }
    }
}
