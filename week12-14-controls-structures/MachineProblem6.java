/*
    Design and develop a simple program for the Air Force to label an 
    aircraft as military of civilian. The program is to be given the plane’s 
    observed speed in km/h (kilometer per hour). The speed will serve as 
    its input. For planes traveling in excess of 1100 km/h, you should display 
    them as “ It’s a civilian aircraft”, between 500 km/h to 1100 km/h,display 
    them as “ It’s a military aircraft!” and for planes traveling at 
    more slower speed – less than 500 km/h, you should display them as 
    an “ It’s a BIRD!”.
*/
import java.io.*;

public class  MachineProblem6{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the speed of the aircraft: ");
        double speed = Double.parseDouble(br.readLine());

        if (speed > 1100) {
            System.out.println("It's a civilian aircraft");
        } else if (speed >= 500 && speed <= 1100) {
            System.out.println("It's a military aircraft!");
        } else if (speed < 500) {
            System.out.println("It's a BIRD!");
        }
    }
}