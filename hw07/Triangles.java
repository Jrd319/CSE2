//This code will generate a 3 triangles using the different types of loops
//JohnDerek Daniels
//CSE 002 Sect.111
//March 23rd 2016
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int X = 0; //set up var for while loop
        int lineNumber = 0;
        
        while (X == 0) { //enter loop if condition is met
            System.out.print("Enter a number between 5 and 30: "); //print statement
            if(input.hasNextInt()) { //if an int was typed in enter if statement
                lineNumber = input.nextInt(); //set var lineNumber to int added
                X = 1; //set X t0 1 so leave while loop
                if (lineNumber >= 5 && lineNumber <= 30) { //if lineNumber is between those numbers do nothing
                }
                else { //if does not meet those condidtions
                    System.out.println("Please Enter a number between 5 and 30.");
                    X = 0; //print statement and reenter loop
                }
            }
            else { //if an int is not entered
                System.out.println("Please Enter an integer.");
                input.next(); //print statement and re enter loop
            }
        }
        
        System.out.println("\nFor Loop:");
        int outerLoop = 0, innerLoop = 0; //create var for outer loop and inner
        for (outerLoop = 0; outerLoop < lineNumber; outerLoop++) { //run while outerloop is less than int added
            for (innerLoop = 1; innerLoop <= outerLoop; innerLoop++) { //run innerloop while less than outer
                System.out.print(outerLoop); //print the number the outerloop is on
            }
            System.out.println(); //go to next line
        }
        
        for (; outerLoop >= 1; outerLoop--) { //the opposite of the first half
            for (innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
                System.out.print(outerLoop);
            }
            System.out.println();
        }
        
        
        System.out.println("\nWhile Loop:");
        outerLoop = 0; //set outerloop back to zero
        while (outerLoop < lineNumber) { //while it is less than int added
            innerLoop = 1; //set innerloop to one
            while (innerLoop <= outerLoop) { //while innerloop is less than the outerloop
                System.out.print(outerLoop); //print the number of the line
                innerLoop++; //add one to innerloop
            }
            System.out.println(); //go to next line
            outerLoop++; //add one to outerloop
        }
        
        while (outerLoop > 0) { //do the opposite
            innerLoop = 1;
            while (innerLoop <= outerLoop) {
                System.out.print(outerLoop);
                innerLoop++;
            }
            System.out.println();
            outerLoop--;
        }
        System.out.println();
        
        
        
        
        System.out.println("Do-While Loop");
        System.out.println();
        outerLoop = 1; //set outloop to one
        do 
        {
            innerLoop = 1; //set inner loop to one
            do 
            {
                System.out.print(outerLoop); //print outterloop once and then every time while innerloop is smaller
                innerLoop++; //add one to innerloop every time
            } while (innerLoop <= outerLoop);
            System.out.println(); //print spaces every time until outerloop is equal to int inputed
            outerLoop++; //add one to outer loop every time
        } while (outerLoop <= lineNumber); //
        
        outerLoop = outerLoop - 2; //reduce outerloop by two
        do  //then do the opposite
        {
            innerLoop = 1;
            do 
            {
                System.out.print(outerLoop);
                innerLoop++;
            } while (innerLoop <= outerLoop);
            System.out.println();
            outerLoop--;
        } while (outerLoop >= 1);
            
    }
}