/*
    18. Write a program that determines the class of the Ship depending
    on its class ID (identifier). Here are the criteria. The class ID serves as
    the input and the Ship class as the output information.

        CLASS ID    SHIP CLASS
        B or b      Battleship
        C or c      Cruiser
        D or d      Destroyer
        F or f      Frigate
*/
import java.io.*;

public class MachineProblem18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter class ID: ");
        char classID = br.readLine().charAt(0);

        switch (classID) {
            case 'B':
            case 'b':
                System.out.println("Battleship");
                break;
            case 'C':
            case 'c':
                System.out.println("Cruiser");
                break;
            case 'D':
            case 'd':
                System.out.println("Destroyer");
                break;
            case 'F':
            case 'f':
                System.out.println("Frigate");
                break;
            default:
                System.out.println("Invalid class ID");
        }
    }
}
