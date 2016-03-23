//This code will generate a twist
//JohnDerek Daniels
//CSE 002 Sect.111
//March 23rd 2016

import java.util.Scanner;

public class Twisty{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int twistLength = 0; //create and initialize variable for length of twist
        int twistWidth = 0; //create and initialize variable for width of twist
        int X = 0; //set up variable for checking if int
        
        while (X == 0) {        //enters while loop since X == 0
            System.out.print("Input your desired Length: "); //get length
            if (input.hasNextInt()) {  //if the number entered is an integer enters if statement
                twistLength = input.nextInt(); //sets var for length equal to number entered
                X = 1; //sets X equal to 1
                if (twistLength <= 80 && twistLength > 0) { //checks if length is postive and less than 80
                } //if both are met leaves while loop
                else { //if one condition is not met
                    System.out.println("Error: please enter a positive length less than 80.");
                    X = 0; //prints error and reenters while loops
                }
            }
            else {  //if a int is not entered
                System.out.println("Error: please type in an integer.");
                input.next(); //prints and reenters while loop
            }
        }
        
        X = 0; //sets X = 0 so enters next while loop
        
        while ( X == 0) { //enters if zero
            System.out.print("Input your desired Width: "); //gets width
            if (input.hasNextInt()) { //if an int enters if statement
                twistWidth = input.nextInt(); //sets Width var to int
                X = 1; 
                if (twistWidth < twistLength && twistWidth > 0) { //checks if width is less than length & positive
                } //if both are met leave loop
                else { //if both are not met
                    System.out.println("Error: Please input an positive integer smaller than the length.");
                    X = 0; //message prints and reenters the while loop
                }
            }
            else { //if an int is not entered
                System.out.println("Error: please type in an integer.");
                input.next(); //prints statement and reenters while loop
            }
        }
        
    
        int nX = 0; //set up a counter
        boolean switchz = true; //set up var to switch between / and \
    
    for (int i = 0; i < twistWidth; i++) {
        nX = 0; //set nX to zero
        switchz = true; //set switchz to true
        while (nX < twistLength) { //set up a loop that runs whie counter is less than length
            for (int j = 0; j < twistWidth; j++) { //set up loop that runs while it is less than width
                if ((j == i && nX < twistLength && switchz)) {
                //prints # when the conditions are met  the boolean is responsible for the whole twist not being #
                System.out.print("#"); //prints #
                nX++; //adds one to counter
                }
                else if (j == (twistWidth - (i + 1)) && nX < twistLength && switchz) { //prints a / at a reducing distance from #
                System.out.print("/"); //prints /
                nX++; //adds one to nX counter
                }
                else if (j == i && nX < twistLength && !switchz) { //prints a \ on an alternate for /
                System.out.print("\\"); //prints \ 
                nX++; //adds one to nX
                }
                else if((j == (twistWidth - (i + 1)) && nX < twistLength && !switchz)) {
                    System.out.print("#");
                    nX++;
                }
                else { //prints a spaces whenever nothing else prints
                System.out.print(" ");
                nX++;
                }
            
            }
            if (switchz) { //alternates between the / \ because the boolean switches after every go
                switchz = false;
            }
            else {
                switchz = true;
            }
        }
     System.out.println(); //go down one line
    }
    
    }
}