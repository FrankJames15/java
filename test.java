import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // program that define odd and even number
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        
    }
}