/*
    25. Write a switch statement that assigns to the variable lumens the
    expected brightness of a standard light bulb whose wattage has been
    stored in watts. Use this table:

        WATTS   BRIGHTNESS
        15      125
        25      215
        40      500
        60      880
        75      1000
        100     1675
        
    Assign -1 to lumens if the value of watts is not in the table
*/
import java.io.*;

public class MachineProblem25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter watts: ");
        int watts = Integer.parseInt(br.readLine());
        int lumens = 0;

        switch (watts) {
            case 15:
                lumens = 125;
                break;
            case 25:
                lumens = 215;
                break;
            case 40:
                lumens = 500;
                break;
            case 60:
                lumens = 880;
                break;
            case 75:
                lumens = 1000;
                break;
            case 100:
                lumens = 1675;
                break;
            default:
                lumens = -1;
                break;
        }

        System.out.println("Brightness: " + lumens);
    }
}
