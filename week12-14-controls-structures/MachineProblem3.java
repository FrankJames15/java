/*
 * Accept two integers and determine of the values are equal, if the values 
    are equal do not print anything, otherwise print the higher number.
 */
import java.io.*;
public class MachineProblem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the first number: ");
        int first = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int second = Integer.parseInt(br.readLine());

        if (first != second) {
            if (first > second) {
                System.out.println("The higher number is " + first);
            } else {
                System.out.println("The higher number is " + second);
            }
        }
    }
}
