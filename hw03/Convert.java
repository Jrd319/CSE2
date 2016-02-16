import java.util.Scanner; //Add scanner to code
public class Convert{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in); //Set up scanner
        
        System.out.print("Enter the distance in meters: "); //Ask for distance in meters
        double distanceMeters= myScanner.nextDouble(); //Turn result into double
        
        
        double distanceFeet= distanceMeters * 3.28; //convert meters to feet
        double distanceInch= distanceFeet * 12; //convert feet to inches
        double roundedInches=Math.round(distanceInch*100)/100.0; //Round off the result
        
        System.out.println(distanceMeters + " meters is " + roundedInches +
        " inches."); //Print the results
    }
}