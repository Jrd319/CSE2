import java.util.Scanner; //Add scanner to program
public class Pyramid{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in); //Setting up scanner
        
        System.out.print("The square side of the pyramid is (input length) : "); //Ask for the square side
        double PyrLength= myScanner.nextDouble(); //Turn the result into a double
        
        System.out.print("The height of the pyramid (input height) : "); //Ask for the height
        double PyrHeight= myScanner.nextDouble(); //Turn the result into a double
        
        double Volume= (PyrLength * PyrLength * PyrHeight) / 3; //Equation for volume of pyramid
        
        System.out.println("The volume inside the pyramid is: " +Volume); //Print the results
        
    }
}