//This code will take three numbers and form a fibonacci sequence with the
//first two numbers that is the length of the third number
//JohnDerek Daniels
//CSE 002 Sect.111
//March 8th 2016
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        Scanner myscanner=new Scanner(System.in);
        
        int X = 0; //sets int X to zero
        int A1 = 0; //sets int A1 to zero
        int A2 = 0; //sets int A2 to zero
        int A3 = 0; //sets int A3 to zero
        
        while ( X == 0) { //if X is zero it will enter the loop
            System.out.println("Enter the first number in the sequence: "); //print statement to get first number
            if (myscanner.hasNextInt()) { //if the number entered is an integer enters if statement
            A1 = myscanner.nextInt(); //sets A1 equal to number entered
            X = 1; //sets X to 1 so leaves while loop
                if(A1>=0){ //if the integer entered is positive then it will leave while loop
                }
                else { //if the integer is negative then it will print the statement and reenter loop
                    System.out.println("Invalid input");
                    X = 0;
                }
            }
            else { //if the number entered is not an integer it will reenter the loop
                System.out.println("Invalid input");
                myscanner.next();
            }
           
        }
        X = 0; //reset X to zero so it enters the next while-loop
        
        while ( X == 0) { //since X is equal to zero it enters the loop
            System.out.println("Entire the second number in the sequence: "); //prompt the user to enter second number
            if (myscanner.hasNextInt()) { //enters if statement if number enters is an integer
            A2 = myscanner.nextInt(); //sets A2 equal to the int
            X = 1; //sets X to 1
                if(A2>=0){ //if int is positive then it leaves the while loop
                }
                else { //if int is negative prints statement and then reenters while loop
                    System.out.println("Invalid input"); 
                    X = 0;
                }
            }
            else { //if number entered is not an int then prints statement and reenter loop
                System.out.println("Invalid input");
                myscanner.next();
            }
        }
        
        X = 0; //sets X back to 0
        
        while ( X == 0) { //repeats the same process for the third number
            System.out.println("How many custom Fibonacci numbers should be printed? ");
            if (myscanner.hasNextInt()) {
            A3 = myscanner.nextInt();
            X = 1;
                if(A3>=0){
                }
                else {
                    System.out.println("Invalid input");
                    X = 0;
                }
            }
            else {
                System.out.println("Invalid input");
                myscanner.next();
            }
        }
        
        System.out.print(A1+","); //print out the first number entered
        System.out.print( A2+","); //print out the second number entered
        A3 = A3 - 2; //subtract two from the third number
        int C = 0; //set int C to zero
        
        while (A3>0){ //create while loop for while A3 is great than zero
            if (A3>1) { //while A3 is great 1
                C = A2 + A1; // C is equal to A1 + A2
                System.out.print( C+","); //print out value for C
                A1 = A2; //set A1 to A2 value
                A2 = C; //set A2 to C value
                A3--; //subtract 1 from C
            } //repeat until A3 is one
            else if (A3 == 1) {
                C = A2 + A1; //add final time
                System.out.print( C+"."); //print last value for C and add period at end
                A3--; //subtract 1 from zero so exits while loop
            }
        }
        System.out.println("");
    }
}