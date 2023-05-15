/*
    16. Write a program that examines the value of a variable called
    TEMP. Then display the following messages, depending on the value
    assigned to TEMP.
    
    TEMPERATURE             MESSAGE
    Less than 0             ICE
    Between 0 and 100       WATER
    Exceeds 100             STEAM
*/

import java.io.*;

public class MachineProblem16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter temperature: ");
        
        int temp = Integer.parseInt(br.readLine());

        if (temp < 0) {
            System.out.println("ICE");
        } else if (temp >= 0 && temp <= 100) {
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }
    }
}
