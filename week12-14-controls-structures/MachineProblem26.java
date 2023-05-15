/*
    26. Create a program that will compute the electric bill of a person
    given the following ranges:

    RANGE                COST
    1 -99 kilowatts      10.00 / kilowatt
    100-249 kilowatts    50.00 / kilowatt after the first 99 kilowatt hours
    250 or more          100 / kilowatt every kilowatt hour succeeding

    Sample output:

    Enter number of kilowatt hours: 10
    Total electric bill is P 100.00

    Enter number of kilowatt hours : 100
    Total electric bill is P 5000.00

    Enter number of kilowatt hours : 251
    Total electric bill is P 8690.00
*/
import java.io.*;

public class MachineProblem26 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of kilowatt hours: ");
        int kilowattHours = Integer.parseInt(br.readLine());
        double totalElectricBill = 0;

        if (kilowattHours >= 1 && kilowattHours <= 99) {
            totalElectricBill = kilowattHours * 10;
        } else if (kilowattHours >= 100 && kilowattHours <= 249) {
            totalElectricBill = (99 * 10) + ((kilowattHours - 99) * 50);
        } else if (kilowattHours >= 250) {
            totalElectricBill = (99 * 10) + ((kilowattHours - 99) * 100);
        }

        System.out.println("Total electric bill is P " + totalElectricBill);
    }
}
