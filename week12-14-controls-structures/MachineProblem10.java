/*
    10. In 2001, Bureau of Internal Revenue proposed an overhaul of the
    Income Tax Law. They proposed the ff. schedule:

    INCOME              TAX RATE
    0 to 5000           0
    5001 to 10000       100 + 3% of income over 5000
    10001 to 25000      200 + 6% of income over 10000
    25001 to 50000      300 + 9% of income over 25000
    Over 50000          500 + 15% of income over 50000
*/
import java.io.*;

public class MachineProblem10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter your income: ");
        double income = Double.parseDouble(br.readLine());
        double tax = 0;
        if (income <= 5000) {
            tax = 0;
        } else if (income > 5000 && income <= 10000) {
            tax = 100 + (income - 5000) * 0.03;
        } else if (income > 10000 && income <= 25000) {
            tax = 200 + (income - 10000) * 0.06;
        } else if (income > 25000 && income <= 50000) {
            tax = 300 + (income - 25000) * 0.09;
        } else if (income > 50000) {
            tax = 500 + (income - 50000) * 0.15;
        }
        System.out.println("The tax is: " + tax);
    }
}
