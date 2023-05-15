/*
    22. Create a program that will compute for the student and print its
    equivalent point. The formula for computing the grade is :

    GRADE = Assign (10%) + Seatwork (20%) + Quiz (30%) + Exam (40%)

    General Average     Equivalent Grade    Remarks
    100-97              1.00                Excellent
    96-94               1.25                Excellent
    93-91               1.50                Very Good
    90-88               1.75                Very Good
    87-85               2.00                Good
    84-82               2.25                Good
    81-79               2.50                Satisfactory
    76-78               2.75                Fair
    75                  3.00                Passed
    Below 75            5.00                Failed
*/

import java.io.*;

public class MachineProblem22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Assign grade: ");
        double assign = Double.parseDouble(br.readLine());

        System.out.print("Enter Seatwork grade: ");
        double seatwork = Double.parseDouble(br.readLine());

        System.out.print("Enter Quiz grade: ");
        double quiz = Double.parseDouble(br.readLine());

        System.out.print("Enter Exam grade: ");
        double exam = Double.parseDouble(br.readLine());

        double totalGrade = (assign * 0.1) + (seatwork * 0.2) + (quiz * 0.3) + (exam * 0.4);

        if (totalGrade >= 97 && totalGrade <= 100) {
            System.out.println("1.00");
        } else if (totalGrade >= 94 && totalGrade <= 96) {
            System.out.println("Equivalent Grade: 1.25");
            System.out.println("Remarks: Excellent");
        } else if (totalGrade >= 91 && totalGrade <= 93) {
            System.out.println("Equivalent Grade: 1.50");
            System.out.println("Remarks: Very Good");
        } else if (totalGrade >= 88 && totalGrade <= 90) {
            System.out.println("Equivalent Grade: 1.75");
            System.out.println("Remarks: Very Good");
        } else if (totalGrade >= 85 && totalGrade <= 87) {
            System.out.println("Equivalent Grade: 2.00");
            System.out.println("Remarks: Good");
        } else if (totalGrade >= 82 && totalGrade <= 84) {
            System.out.println("Equivalent Grade: 2.25");
            System.out.println("Remarks: Good");
        } else if (totalGrade >= 79 && totalGrade <= 81) {
            System.out.println("Equivalent Grade: 2.50");
            System.out.println("Remarks: Satisfactory");
        } else if (totalGrade >= 76 && totalGrade <= 78) {
            System.out.println("Equivalent Grade: 2.75");
            System.out.println("Remarks: Fair");
        } else if (totalGrade == 75) {
            System.out.println("Equivalent Grade: 3.00");
            System.out.println("Remarks: Passed");
        } else {
            System.out.println("Equivalent Grade: 5.00");
            System.out.println("Remarks: Failed");
        }
    }
}
