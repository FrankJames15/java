/*
    19. Write a program that computes and assess the TF of the students
    in one semester, based on the given mode of payment below:
    
        PLAN KEY                Discount or Interest
        1. CASH                 10% discount
        2. Two Installment      5% Interest
        3. Three Installment    10% interest

    The target user must use the key in selecting or choosing the mode of
    payment. The first input data is the TF, and the second input data is the
    mode of payment

    SAMPLE INPUT / OUTPUT DIALOGUE:
    
        Enter Tuition Fee : 20000
        (Press 1 for Cash, 2 for Two installment , 3 for Three Installment)
        Enter mode of payment : 2
        Your Total Tuition Fee is : 21000
*/
import java.io.*;

public class MachineProblem19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter tuition fee: ");
        double tuitionFee = Double.parseDouble(br.readLine());
        System.out.println("Press 1 for Cash, 2 for Two installment, 3 for Three Installmen");
        System.out.print("Enter mode of payment: ");

        int modeOfPayment = Integer.parseInt(br.readLine());

        switch (modeOfPayment) {
            case 1:
                System.out.println("Your total tuition fee is: " + (tuitionFee * 0.9));
                break;
            case 2:
                System.out.println("Your total tuition fee is: " + (tuitionFee * 1.05));
                break;
            case 3:
                System.out.println("Your total tuition fee is: " + (tuitionFee * 1.1));
                break;
            default:
                System.out.println("Invalid mode of payment");
        }
    }
}
