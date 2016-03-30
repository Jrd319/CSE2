//This code will generate a box of "%" or a list of a String depending the the method 
//JohnDerek Daniels
//CSE 002 Sect.111
//March 29th 2016
import java.util.Scanner;

public class Rectangularize {
    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
    
        System.out.println("Please enter an input:"); //prompt user to enter an input
        
        if (input.hasNextInt()) { //if the input is a character
            int squareSize = input.nextInt(); //set variable to int
            Rectangle(squareSize); //enter rectangle for ints
        }
        else { //if it is a string
            String SquareSize = input.next(); //set the variable equal to the string
            Rectangle(SquareSize); //enter rectangle for strings
        }
    
    
    }
    
    public static int Rectangle(int squareSize) { //enter method
        
        int squareSizeWidth = squareSize; //set second variable equal to square size
        int n = squareSize; //set another variable equal to square size
        
        System.out.println("Output: ");
        
        while (squareSize > 0) { //while square size is greater than zero this will run
            squareSizeWidth = n; //reset value of n
            while (squareSizeWidth > 0) { //prints out until n is 0
                System.out.print("%"); //prints this sign out
                squareSizeWidth--; //subtract one every time
            }
        System.out.println(""); //new line
        squareSize--; //subtract one
        }
        
        return squareSize;
        
        
    }
    
    public static String Rectangle(String squareSize) {
        
        int length = squareSize.length(); //set variable equal to lenth of string
        
        System.out.println("Output: ");
        
        while (length > 0) { //while length is greater than zero
            System.out.println(squareSize); //print out the string on a new line
            length--; //decline every time
        }
        
        return squareSize;
        
    }
}