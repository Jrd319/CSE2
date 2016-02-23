//This program is meant to convert 3 integers between 0-255 to hexidecimal
//JohnDerek Daniels
//CSE 002 Section. 111

import java.util.Scanner; 

public class ToHex {
    public static void main(String[] args) {
        
        Scanner myScanner= new Scanner ( System.in );
        
        int rValue; //declare the red integer
        int gValue; //declare the green integer
        int bValue; //declare the blue integer
        
        System.out.println("Please enter three number representing RGB values (x x x): ");
        if (myScanner.hasNextInt()) {             //get the red value and check if it is an integer
            rValue = myScanner.nextInt();         //if integer saves value to rValue
            
        }
        else {
            System.out.println("Sorry, your input must consist of integers"); //if not print statement and return
            return;
        }
        
        
        if(myScanner.hasNextInt()) {           //get the value for green and check for integer
            gValue = myScanner.nextInt();      //if integer save value to gValue
        }
        else {
             System.out.println("Sorry, your input must consist of integers"); //if not print statement and return
            return;
        }
        
        
        if (myScanner.hasNextInt()) {           //same process as above except for blue value
            bValue = myScanner.nextInt();
            
        }
        else {
            System.out.println("Sorry, your input must consist of integers");
            return;
        }
        
        
        if (rValue<0 || rValue>255) {  //Next it checks if the value for red is between 0-255
            System.out.println("Sorry, you must enter values between 0-255"); //if out of range prints statement and returns
            return;
        }
         else if (gValue<0 || gValue>255) {   //Checks if green value is between 0-255
            System.out.println("Sorry, you must enter values between 0-255");   //same as above
            return;
        }
         else if (bValue<0 || bValue>255) {     //Checks if blue value is between 0-255
            System.out.println("Sorry, you must enter values between 0-255");  //same as above
            return;
        }
        
        
            int rValueFirst= (int) (rValue / 16); //to get first number of hexidecimal divide rValue by 16
            int rValueSecond= (int) (rValue % 16); //to get second number of hexidecimal find remainder of rValue and 16
            int gValueFirst= (int) (gValue / 16); //to get third number of hexidecimal divide gValue by 16
            int gValueSecond= (int) (gValue % 16); //to get fourth number of hexidecimal find remained of gValue and 16
            int bValueFirst= (int) (bValue / 16); //to get fifth number divide bValue by 16
            int bValueSecond= (int) (bValue % 16); //to get sixth number find remained of bValue and 16
            
            String rValueFirstString = "";
            rValueFirstString = Integer.toString(rValueFirst); //convert result for first number to String
            String rValueSecondString = "";
            rValueSecondString = Integer.toString(rValueSecond); //convert result for second number to String
            
            
            switch (rValueFirst) { //convert first number to letter if bigger than 9
                case 10:
                    rValueFirstString = "A";
                    break;
                case 11:
                    rValueFirstString = "B";
                    break;
                case 12:
                    rValueFirstString = "C";
                    break;
                case 13:
                    rValueFirstString = "D";
                    break;
                case 14:
                    rValueFirstString = "E";
                    break;
                case 15:
                    rValueFirstString = "F";
                    break;
            }
            
            switch (rValueSecond) { //convert second number to letter if bigger than 9
                case 10:
                    rValueSecondString = "A";
                    break;
                case 11:
                    rValueSecondString = "B";
                    break;
                case 12:
                    rValueSecondString = "C";
                    break;
                case 13:
                    rValueSecondString = "D";
                    break;
                case 14:
                    rValueSecondString = "E";
                    break;
                case 15:
                    rValueSecondString = "F";
                    break;
            }
       
            String gValueFirstString = "";
            gValueFirstString = Integer.toString(gValueFirst); //convert result for third number to string
            String gValueSecondString = "";
            gValueSecondString = Integer.toString(gValueSecond); //convert result for foruth number to string
            
            switch (gValueFirst) { //convert third number to letter if bigger than 9
                case 10:
                    gValueFirstString = "A";
                    break;
                case 11:
                    gValueFirstString = "B";
                    break;
                case 12:
                    gValueFirstString = "C";
                    break;
                case 13:
                    gValueFirstString = "D";
                    break;
                case 14:
                    gValueFirstString = "E";
                    break;
                case 15:
                    gValueFirstString = "F";
                    break;
            }
            
            switch (gValueSecond) { //convert fourth number to letter if bigger than 9
                case 10:
                    gValueSecondString = "A";
                    break;
                case 11:
                    gValueSecondString = "B";
                    break;
                case 12:
                    gValueSecondString = "C";
                    break;
                case 13:
                    gValueSecondString = "D";
                    break;
                case 14:
                    gValueSecondString = "E";
                    break;
                case 15:
                    gValueSecondString = "F";
                    break;
            }
            
            String bValueFirstString = "";
            bValueFirstString = Integer.toString(bValueFirst); //convert result for fifth number to String
            String bValueSecondString = "";
            bValueSecondString = Integer.toString(bValueSecond); //convert result for sixth number to String
            
            switch (bValueFirst) { //convert fifth number to letter if bigger than 9
                case 10:
                    bValueFirstString = "A";
                    break;
                case 11:
                    bValueFirstString = "B";
                    break;
                case 12:
                    bValueFirstString = "C";
                    break;
                case 13:
                    bValueFirstString = "D";
                    break;
                case 14:
                    bValueFirstString = "E";
                    break;
                case 15:
                    bValueFirstString = "F";
                    break;
            }
            
            switch (bValueSecond) { //convert last number to letter if bigger than 9
                case 10:
                    bValueSecondString = "A";
                    break;
                case 11:
                    bValueSecondString = "B";
                    break;
                case 12:
                    bValueSecondString = "C";
                    break;
                case 13:
                    bValueSecondString = "D";
                    break;
                case 14:
                    bValueSecondString = "E";
                    break;
                case 15:
                    bValueSecondString = "F";
                    break;
            }
            
            System.out.println("The decimal numbers R:" +rValue+ ", G:" +gValue+ ", B:"
            +bValue+ ", is represented in hexidecimal as: " +rValueFirstString+rValueSecondString
            +gValueFirstString+gValueSecondString+bValueFirstString+bValueSecondString);
            
        //print all the number together to get final hexidecimal
        
    }
}