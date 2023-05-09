import java.io.*;

public class MachineProblem14{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            14. Input three unique numbers and arrange the numbers in lowest to highest order.
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

        System.out.println("The lowest number is " + lowest);
        System.out.println("The middle number is " + middle);
        System.out.println("The highest number is " + highest);
    }
}
