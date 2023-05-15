/*
    17. The national Earthquake Information Center has the ff. criteria to
    determine the earthquake’s damage. Here are the given Richter scale
    criteria and their corresponding characterization. The Richter scale
    serves as the input data and the characterization as output information.

    RITCHER NUMBER      CHARACTERIZATION
    Less than 5         LITTLE OR NO DAMAGE
    5.0 to 5.5          SOME DAMAGE
    5.5 to 6.5          SERIOUS DAMAGE
    6.5 to 7.5          DISASTER
    HIGHER              CATASTROPHE
*/
import java.io.*;

public class MachineProblem17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Richter scale: ");
        double richter = Double.parseDouble(br.readLine());

        if (richter < 5) {
            System.out.println("LITTLE OR NO DAMAGE");
        } else if (richter >= 5 && richter < 5.5) {
            System.out.println("SOME DAMAGE");
        } else if (richter >= 5.5 && richter < 6.5) {
            System.out.println("SERIOUS DAMAGE");
        } else if (richter >= 6.5 && richter < 7.5) {
            System.out.println("DISASTER");
        } else {
            System.out.println("CATASTROPHE");
        }
    }
}
