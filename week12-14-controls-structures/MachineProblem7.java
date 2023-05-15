import java.io.*;

public class MachineProblem7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            Write a program that reads in the sales expenses of the Short Distance
            Telephone Company for the past year and then calculate the profit and
            the next tax based on the ff. table
              PROFIT                  TAX RATE  
              0 to 10,000            0
              10,001 to 30,000      100 + 3% of the profit
              30,001 to 50,000      200 + 5% of the profit
              Over 50,000           500 + 7% of the profit
        */
        System.out.print("Enter the sales expenses: ");
        double salesExpenses = Double.parseDouble(br.readLine());
        
        double profit = salesExpenses - 10000;
        double tax = 0;

        if (profit <= 0) {
            tax = 0;
        } else if (profit > 0 && profit <= 20000) {
            tax = 100 + profit * 0.03;
        } else if (profit > 20000 && profit <= 40000) {
            tax = 200 + profit * 0.05;
        } else if (profit > 40000) {
            tax = 500 + profit * 0.07;
        }
        System.out.println("The tax is: " + tax);
    }
}
