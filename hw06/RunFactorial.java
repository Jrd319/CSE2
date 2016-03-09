//This code will use a while-loop to solve factorial problem
//JohnDerek Daniels
//CSE 002 Sect.111
//March 8th 2016
import java.util.Scanner;

public class RunFactorial {
    public static void main (String[] args) {
        Scanner myscanner=new Scanner(System.in);
        
        int X = 0; //set int X to zero
        int Factorial = 0; //set int Factorial to zero
        
        while ( X == 0) { //since X is zero it enters the loop
            System.out.println("Please Enter an integer that is between 9 and 16: "); //asks for an integer
            if (myscanner.hasNextInt()) { //if an integer it enters if statement
            Factorial = myscanner.nextInt(); //sets int Factorial to value from scanner
            X = 1; //sets X to 1 so it wont repeat while-loop
                if(Factorial>9 && Factorial<16){ //checks if Factorial is between 9 & 16
                    System.out.println("Input accepted: "); //if it is exits loop
                }
                else { //if is not between values returns to while-loop
                    System.out.println("Invalid input,enter again!");
                    X = 0;
                }
            }
            else { //if not an integer prints and repeats while-loop
                System.out.println("Invalid input,enter again!");
                myscanner.next();
            }
           
        }
        
        int total = 1; //sets int total to 1
        int C = 0; //sets C to 0
        System.out.print( Factorial+ "!"); //prints out first part of factorial
        
        while (Factorial>0) { //starts while-loop while factorial is greater than zero
            C = Factorial; //set C to int Factorial
            total = total * C; //multiply total by value of C
            Factorial--; //reduce factorial by 1
        } //rerun while loop until factorial is equal to zero
        
        System.out.print(" = "+total); //print out remaining part of factorial
        System.out.println("");
        
    }
}