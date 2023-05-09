/*
    Input three unique numbers and print the lowest number
*/

import java.io.*;

public class MachineProblem13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter the second number: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("Enter the third number: ");
        int num3 = Integer.parseInt(br.readLine());
        
        int lowest = num1;
        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }
        System.out.println("The lowest number is " + lowest);
    }
}
