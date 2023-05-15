 /*
    23. Implement the ff. decision table using a nested if statement.
    Assume that the grade point average is within the range 0.0 through
    4.0

    GRADE POINT AVERAGE     TRANSCRIPT MESSAGE
    0.0 – 0.99              Failed semester – registration suspended
    1.0 – 1.99              On probation for next semester
    2.0 – 2.99              ( no message )
    3.0 – 3.49              Dean’s list for semester
    3.5 – 4.00              Highest honors for semester
*/

import java.io.*;

public class MachineProblem23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter grade point average: ");
        double gpa = Double.parseDouble(br.readLine());

        if (gpa >= 0.0 && gpa <= 0.99) {
            System.out.println("Failed semester – registration suspended");
        } else if (gpa >= 1.0 && gpa <= 1.99) {
            System.out.println("On probation for next semester");
        } else if (gpa >= 2.0 && gpa <= 2.99) {
            System.out.println("( no message )");
        } else if (gpa >= 3.0 && gpa <= 3.49) {
            System.out.println("Dean’s list for semester");
        } else if (gpa >= 3.5 && gpa <= 4.0) {
            System.out.println("Highest honors for semester");
        } else {
            System.out.println("Invalid grade point average");
        }
    }
}
