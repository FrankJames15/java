package PrefinalExam;

import java.io.*;

public class TicTacToe {
    public static void main(String[] args) {
        /*
         * Long ago, th four nations lived together in harmony. Then, everything changed
         * when the Fire Nation attacked. Only the Hokage, master of tictactoe,
         * could stop them, but when the world needed him most, he vanished.
         * 
         * A hundred years passed you discovered the new Hokage, Juan. And although
         * Juan's
         * strategy skills are great, he couldn't determine if he already won or lose
         * the game.
         * As a programmer, let us help Juan in his battle against the fire nation.
         * 
         * Input consist of three integers X1, X2, X3, (X1 < X2 < X3) that denotes teh
         * three locations of
         * X marks in the tic-tac-toe board.
         * 
         * For each test case, output "You Win!!" if Juan wins the given locations of X
         * marks, otherwise
         * output "You Lose!!".
         * 
         * the program should as for user input.
         */
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the first location of X: ");
            int x1 = Integer.parseInt(br.readLine());
            System.out.print("Enter the second location of X: ");
            int x2 = Integer.parseInt(br.readLine());
            System.out.print("Enter the third location of X: ");
            int x3 = Integer.parseInt(br.readLine());

            if (x1 < x2 && x2 < x3) {
                System.out.println("You Win!!");
            } else {
                System.out.println("You Lose!!");
            }
        } catch (IOException e) {
            System.out.println("Error reading input.");
        }
    }
}
