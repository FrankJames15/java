/*
    A college student who is registered for 21 units or more is considered 
    as full time student. The tuition fee for full time is 7000. A part time 
    student is charged 300 per unit for tuition. Given the number of units a 
    student is registering, calculate and print his tuition fee on the basis of 
    the given criteria.
*/

import java.io.*;

public class MachineProblem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the number of units: ");
        int units = Integer.parseInt(br.readLine());
        double tuition = 0.0;

        if (units >= 21) {
            tuition = 7000;
        } else {
            tuition = units * 300;
        }

        System.out.println("The tuition fee is " + tuition);
    }
}
