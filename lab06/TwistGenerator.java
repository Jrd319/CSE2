//This code will take a length that is imputed by the user and then turn it into a twist
//JohnDerek Daniels
//CSE 002 Sect.111
//March 4th 2016
import java.util.Scanner;

public class TwistGenerator {
    public static void main (String[] args) {
        Scanner myscanner=new Scanner(System.in);
        
        int Length=1;
        System.out.println("Please enter a positive integer for length of twist: ");
        boolean nonInt = myscanner.hasNextInt();
        Length = myscanner.nextInt();
        
      
            while (!nonInt){
                System.out.println("Please reenter a postive INTEGER for length of twist: ");
                    if (myscanner.hasNextInt()) {
                        nonInt = true;
                    }
                    else {
                        nonInt = false;
                    } 
                        
            }
            
            
            while (Length < 0) {
                System.out.println("Please enter a POSITIVE integer for length of twist: ");
                Length = myscanner.nextInt();
            }
            
            int topPart = Length;
            int middlePart = Length; 
            int bottomPart = Length;
            
            while (topPart > 0) {
                System.out.print("\\");
                topPart--;
                if(Length > 0) {
                    System.out.print(" ");
                    topPart--;
                }
                if(topPart > 0) {
                    System.out.print("/");
                    topPart--;
                }
            }
            
            System.out.println(" ");
            
            while (middlePart > 0) {
                System.out.print(" ");
                middlePart--;
                if(middlePart > 0) {
                    System.out.print("X");
                    middlePart--;
                }
                if(middlePart > 0) {
                    System.out.print(" ");
                    middlePart--;
                }
            }
            
            System.out.println(" ");
            
            while (bottomPart > 0) {
                System.out.print("/");
                bottomPart--;
                if(bottomPart > 0) {
                    System.out.print(" ");
                    bottomPart--;
                }
                if(bottomPart > 0) {
                    System.out.print("\\");
                    bottomPart--;
                }
            }
            
            System.out.println(" ");
            
            
    }
}