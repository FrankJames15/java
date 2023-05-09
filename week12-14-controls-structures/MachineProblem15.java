import java.io.*;

public class MachineProblem15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            15. Input three unique numbers and print the difference of the highest
            and lowest numbers.
        */
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("Enter the third number: ");
        int num3 = Integer.parseInt(br.readLine());

        int lowest = num1;
        int middle = num2;
        int highest = num3;

        if (num2 < lowest) {
            lowest = num2;
            middle = num1;
        }
        if (num3 < lowest) {
            lowest = num3;
            middle = num1;
            highest = num2;
        }
        if (num3 < middle) {
            middle = num3;
            highest = num2;
        }

        System.out.println("The difference of the highest and lowest numbers is " + (highest - lowest));
    }
}
