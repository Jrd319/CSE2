//This code will create a spinner
//JohnDerek Daniels
//CSE 002 Sect.111
//March 8th 2016
public class TextSpinner {
    public static void main (String[] args) {
    
        int X = 1;
        
        while ( X > 0) { //while x is greater than the while loop will continue
            System.out.print("/"); //print the first part of the spinner
            System.out.print("\b"); //delete the character
            System.out.print("-"); //print the second part of the spinner
            System.out.print("\b"); //delete the character
            System.out.print("\\"); //print the third part of the spinner
            System.out.print("\b"); //delete the character
            System.out.print("|"); //print the final part of the spinner
            System.out.print("\b"); //delete the character
        
            //repeat the spinner
        }
    }
}
        
        