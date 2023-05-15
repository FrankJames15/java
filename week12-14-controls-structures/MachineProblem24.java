/*
    24. Implement the ff. decision table using a multiple – alternative if
    statement. Assume that the wind speed is given as in integer.

    Wind Speed      Category

    Below 25        not a strong wind
    25 – 38         strong wind
    39-54           gale
    55-72           whole gale
    Above 72        hurricane
*/

import java.io.*;

public class MachineProblem24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter wind speed: ");
        int windSpeed = Integer.parseInt(br.readLine());

        if (windSpeed < 25) {
            System.out.println("not a strong wind");
        } else if (windSpeed >= 25 && windSpeed <= 38) {
            System.out.println("strong wind");
        } else if (windSpeed >= 39 && windSpeed <= 54) {
            System.out.println("gale");
        } else if (windSpeed >= 55 && windSpeed <= 72) {
            System.out.println("whole gale");
        } else if (windSpeed > 72) {
            System.out.println("hurricane");
        } else {
            System.out.println("Invalid wind speed");
        }
    }
}
