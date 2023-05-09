/*
 * 12. Design and develop a simple application program that adds,
 * subtract, multiply and divide two input number:
 * 
 * SAMPLE OUTPUT
 * 1. ADD TWO NUMBERS
 * 2. SUBTRACT TWO NUMBERS
 * 3. MULTIPPLY TWO NUMBERS
 * 4. DIVIDE TWO NUMBER
 * 5. EXIT
 * 
 * ENTER YOUR CHOICE : 1
 * Enter the first number : 10
 * Enter the second number : 10
 * The Sum is 20
 */
import java.io.*;

public class MachineProblem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("1. ADD TWO NUMBERS");
        System.out.println("2. SUBTRACT TWO NUMBERS");
        System.out.println("3. MULTIPPLY TWO NUMBERS");
        System.out.println("4. DIVIDE TWO NUMBER");
        System.out.println("5. EXIT");
        System.out.print("\nENTER YOUR CHOICE : ");
        int choice = Integer.parseInt(br.readLine());

        System.out.print("Enter the first number : ");
        double num1 = Double.parseDouble(br.readLine());

        System.out.print("Enter the second number : ");
        double num2 = Double.parseDouble(br.readLine());

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The Sum is " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The Difference is " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The Product is " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("The Quotient is " + result);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
