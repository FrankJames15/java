/*
     An employee’s weekly working hours is 40. If an employee exceeds 40 
    hours, it is considered overtime. Create a program that will accept the 
    number of hours worked by employee and his / her hourly rate and print 
    the gross pay and overtime pay rendered, if there’s no OT pay to print, 
    print only the gross pay. To compute for the gross pay of an employee, 
    multiply the number of hours worked by his/her hourly rate plus his/her 
    OT pay. OT hours are time rendered by employee over 40 hours. The 
    overtime hours rendered should be computed by using 1.50% of his 
    hourly rate.
 */

import java.io.*;

public class MachineProblem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of hours worked: ");
        int hours = Integer.parseInt(br.readLine());
        System.out.print("Enter the hourly rate: ");
        double rate = Double.parseDouble(br.readLine());
        double grossPay = 0;
        double overtimePay = 0;
        if (hours > 40) {
            overtimePay = (hours - 40) * rate * 1.5;
            grossPay = 40 * rate + overtimePay;
        } else {
            grossPay = hours * rate;
        }
        System.out.println("The gross pay is " + grossPay);
        if (overtimePay > 0) {
            System.out.println("The overtime pay is " + overtimePay);
        }
    }
}