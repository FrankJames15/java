import java.io.*;
// import javax.swing.JOptionPane;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java
import java.util.Arrays;

public class test {
    
    static void check(int[] attempt) 
    {
        // Row
        int[] row1 = {1, 2, 3};
        int[] row2 = {4, 5, 6};
        int[] row3 = {7, 8, 9};
    
        // Column
        int[] col1 = {1, 4, 7};
        int[] col2 = {2, 5, 8};
        int[] col3 = {3, 6, 9};
        
        // Diagonal
        int[] diag1 = {1, 5, 9};
        int[] diag2 = {3, 5, 7};

        boolean isWin = false;

        for(int i = 0; i < attempt.length; i++)
        {
            if(
                attempt[i] == row1[i]  ||
                attempt[i] == row2[i]  ||
                attempt[i] == row3[i]  ||
                attempt[i] == col1[i]  ||
                attempt[i] == col2[i]  ||
                attempt[i] == col3[i]  ||
                attempt[i] == diag1[i] ||
                attempt[i] == diag2[i]
               )
            {   
                isWin = true;
            }
            else
            {
                isWin = false;
            }
        }

        if (isWin)
            System.out.println("Your Win!!");
        else
            System.out.println("You Lose!!");

    }
    public static void main(String[] args) throws IOException {
        int again = 1;
        do
        {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] numbers = new int[3];
            
            for( int i = 0; i < numbers.length; i++)
            {
                System.out.printf("Enter number for X" + (i+1) + ": ");
                numbers[i] = Integer.parseInt(br.readLine());
            }
            check(numbers);

            System.out.println("Type 0 to exit");
            again = Integer.parseInt(br.readLine());

            if(again == 0)
                System.out.println("Thank You!");
        } while ( again != 0);
    }
}