/*
 * Input three integers and identify if there are equal numbers. If there are 
    equal numbers print the equal numbers, otherwise print the average of 
    the numbers.
 */
import java.io.*;
public class MachineProblem4 {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(br.readLine());
        System.out.print("Enter the third number: ");
        int third = Integer.parseInt(br.readLine());


        if (first == second && second == third) {
            System.out.println("The numbers are equal");
        } else if (first == second) {
            System.out.println("The first and second numbers are equal");
        } else if (second == third) {
            System.out.println("The second and third numbers are equal");
        } else if (first == third) {
            System.out.println("The first and third numbers are equal");
        } else {
            System.out.println("The average of the numbers is " + (first + second + third) / 3.0);
        }
    }
}
