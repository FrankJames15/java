/*
    Any customer whose total purchase is at least 2000 will be given a 5% 
    percent discount. Write a program that reads in the customer purchase 
    and outputs the amount to be paid
*/ 

import java.io.*;

public class MachineProblem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the total purchase: ");
        double purchase = Double.parseDouble(br.readLine());
        double discount = 0.0;
        if (purchase >= 2000) {
            discount = purchase * 0.05;
        }
        System.out.println("The amount to be paid is " + (purchase - discount));
    }
}