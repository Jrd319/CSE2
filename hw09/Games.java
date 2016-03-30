//This code will generate a Game center in which the user has a choice of playing games
//JohnDerek Daniels
//CSE 002 Sect.111
//March 29th 2016
import java.util.Scanner;
import java.util.Random;

public class Games {

    public static void main(String[] args) {
        
    Scanner input = new Scanner (System.in);
        
        System.out.println("Welcome to JD's Game Center!"); //Print out the introducion to my game
        System.out.println("Please select from out large variety of games including: ");
        System.out.println("1. guessTheBox");
        System.out.println("2. spinTheWheel");
        System.out.println("3. scrambler");
        System.out.print("So which one will it be: ");
        
        String gameChoice = input.next(); //prompt user to pick which game they want to play
        
        if ("scrambler".equals(gameChoice)) { //if the user pick scrambler the neter thsi program
            System.out.println("In this game you will enter any work and then the program will randomize it");
            System.out.println("Please enter the word you wish to be randomized: ");
            String word1 = input.next(); //use the word that the user enters
            System.out.println("Your word is: " +word1); //print the word back to user
            Scrambler(word1); //enter method
        }
        else if ("guessTheBox".equals(gameChoice)) { //enter this game if user pick it
            System.out.println("In this game there are 3 boxes and you must guess which box the prize is in.");
            int guess = 0;
            int Q = 0;
            while (Q == 0) { //make sure the users guess is 1, 2, or 3
                System.out.println("You do this by entering a number 1, 2, or 3.");
                guess = input.nextInt();
                if (guess == 1){
                    Q = 1;
                }
                else if (guess == 2) {
                    Q = 1;
                }
                else if (guess == 3) {
                    Q = 1;
                }
                else {
                    System.out.println("Error!");
                }
            }
            boxGuess(guess); //enter method
        }
        else if ("spinTheWheel".equals(gameChoice)) { //if user pick this game enter it
            System.out.println("In this game there are section half of which are red and the other half are black.");
            System.out.println("Each section has a number between 1-5 like black 2 or red 4.");
            String tileGuess = ""; 
            int X = 0;
            while (X == 0) { //make sure the user pick a tile that exists
                System.out.print("Alright which tile do the think the spinner is on? ");
                tileGuess = input.next() + " " + input.next();
                System.out.println("Your guess was " +tileGuess);
                    if ("Black 1".equals(tileGuess) || "Black 2".equals(tileGuess) || "Black 3".equals(tileGuess) || "Black 4".equals(tileGuess) || "Black 5".equals(tileGuess)) {
                        X = 1;
                    }
                    else if ("black 1".equals(tileGuess) || "black 2".equals(tileGuess) || "black 3".equals(tileGuess) || "black 4".equals(tileGuess) || "black 5".equals(tileGuess)){
                        X = 1;
                    }
                    else if ("Red 1".equals(tileGuess) || "Red 2".equals(tileGuess) || "Red 3".equals(tileGuess) || "Red 4".equals(tileGuess) || "Red 5".equals(tileGuess)) {
                        X = 1;
                    }
                    else if ("red 1".equals(tileGuess) || "red 2".equals(tileGuess) || "red 3".equals(tileGuess) || "red 4".equals(tileGuess) || "red 5".equals(tileGuess)) {
                        X = 1;
                    }
                    else {
                        System.out.println("Please enter your guess in the correct format!");
                        X = 0;
                    }
            }
            spinWheel(tileGuess); //enter this method
        }
        else {
            System.out.println("Error! This arcade does not have that game! Check spelling!"); 
            return; //Tell the user they have selected a game that does not exist and exit
        }
        
    }

    public static int boxGuess(int num1) { //enter method of box guessing game
        
        int result; 
        
        if (num1 == 1 || num1 == 2 || num1 == 3) { //if their guess is 1, 2 , or 3
            int Answer = (int) (Math.random() * 3 + 1); //find random number for box
            if (Answer == num1) { //they their guess and the box number are the same then they won
                System.out.println("CONGRATS! You got it correct!");
            }
            else {
                System.out.println("Darn! So close! The correct answer was: " +Answer);
            } //if they are different then print the correct box number
        }
        else {
            System.out.println("Error. The number you enter is not 1, 2, or 3.");
        }
        return num1; //return
    }
    
    public static String spinWheel(String tileGuess) { //enter method for wheel spin
        
        int result;
        
        int secondHalf = (int) (Math.random() * 5 + 1); //get random number for tile number
        int firstHalf = (int) (Math.random() * 2 + 1); //get random number for tile color
        
        switch(firstHalf){ //enter switch statement
            case 1: //if number is 1 then the tile is black 
                String color = "black"; //lowercase color
                String colorUP = "Black"; //uppercase color
                String tileName = color + " " + secondHalf; //form the correct answer
                String tileNameUP = colorUP + " " + secondHalf; //form the uppercase correct answer
                if(tileName.equals(tileGuess) || tileNameUP.equals(tileGuess)) { //if they are the same
                    System.out.println("Congrats you guessed the tile correctly!"); 
                }
                else { //if they are different print the correct answer
                    System.out.println("Sorry you guessed incorrectly! The correct answer was " +tileName+ " or " +tileNameUP);
                }
                break;
            case 2: //same thing if the color is red
                color = "red";
                colorUP = "Red";
                tileName = color + " " + secondHalf;
                tileNameUP = colorUP + " " + secondHalf;
                if(tileName.equals(tileGuess) || tileNameUP.equals(tileGuess)) {
                    System.out.println("Congrats you guessed the tile correctly!");
                }
                else {
                    System.out.println("Sorry you guessed incorrectly! The correct answer was " +tileName+ " or " +tileNameUP);
                }
                break;

        }
        
        return tileGuess;
    }
    
    public static String Scrambler(String word1) { //enter method
        
    Random randomGenerator = new Random (); //random generator
    
    char result;

    
    for (int j = 0; j < 10; j++) { //for loop that runs how many time the letters are mixed up

        int g = randomGenerator.nextInt(word1.length()) ; //determine a number that is less than length of string
        result = word1.charAt(g); //get the letter that is at this number
        String s2 = Character.toString(result); 
        for (int i = 1; i < word1.length(); i++) { //for loop that is less than the lenth of word
            if (i!= g) { //swtich where the character appears in string
            s2 = s2 + Character.toString(word1.charAt(i)); 
            } 
        else { //bring the other character to the spot
            s2 = s2 + Character.toString(word1.charAt(0));
        }
        } 
        word1 = s2;  //get the new word to become more mixed up
    }      

    System.out.println("Your mixed up word is " +word1); //print out new mixed up word
    return word1;
    }
    
}
    


