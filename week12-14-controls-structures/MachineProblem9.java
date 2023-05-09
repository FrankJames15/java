import java.io.*;

public class MachineProblem9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            9. Create a program that will compute the real estate tax, given the
            following formulas :
                a) If value of real estate is less than 250,001.00 tax is 5% of the real
                estate value
                b) If value of real estate is b/w 250,001.00 to 500,000.00, tax is 10%
                of the real estate value
                c) If more than 500,000 tax is 15% of the real estate value
         */
        System.out.print("Enter the value of real estate: ");
        double value = Double.parseDouble(br.readLine());
        double tax = 0;
        if (value < 250001) {
            tax = value * 0.05;
        } else if (value >= 250001 && value <= 500000) {
            tax = value * 0.10;
        } else if (value > 500000) {
            tax = value * 0.15;
        }
        System.out.println("The tax is: " + tax);
    }
}
