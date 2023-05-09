/*
    11. Employees of ABC Electric Corporation are given raises as follows:
        Sales person (15%), 
        Linemen (10%), 
        Engineer ( 8%),. 
    Write a program that will input the employees position, then input the salary and
    calculate/display the new salary based on the their job category.
*/
import java.io.*;

public class MachineProblem11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the employee's position: ");
        String position = br.readLine();

        System.out.print("Enter the employee's salary: ");
        double salary = Double.parseDouble(br.readLine());
        
        double newSalary = 0;

        if (position.equals("Sales person")) {
            newSalary = salary * 1.15;
        } else if (position.equals("Linemen")) {
            newSalary = salary * 1.10;
        } else if (position.equals("Engineer")) {
            newSalary = salary * 1.08;
        }
        System.out.printf("The new salary is : $%.2f", newSalary);
    }
}
