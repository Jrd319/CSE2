//This program is a random card generator
public class CardGenerator{
    public static void main (String[] args) {
        
        int randomNumber = (int) (Math.random() * 53);
        
        String Suit = "";
        
        if (randomNumber <= 13) {
            Suit = "Diamonds";

        }
        else if (randomNumber > 13 & randomNumber <= 26) {
            Suit = "Clubs";

        }
        else if (randomNumber > 26 & randomNumber <= 39) {
           Suit = "Hearts";

        }
        else {
           Suit = "Spades";
        }
        
        
        int randomNumber2 = (int) (Math.random() * 14);
        
        switch(randomNumber2){
            case 1:
                System.out.println("Ace");
                break;
            case 2: 
                System.out.println("1");
                break;
            case 3:
                System.out.println("2");
                break;
            case 4:
                System.out.println("3");
                break;
            case 5:
                System.out.println("4");
                break;
            case 6:
                System.out.println("5");
                break;
            case 7:
                System.out.println("6");
                break;
            case 8:
                System.out.println("7");
                break;
            case 9:
                System.out.println("8");
                break;
            case 10:
                System.out.println("9");
                break;
            case 11:
                System.out.println("Jack");
                break;
            case 12:
                System.out.println("Queen");
                break;
            case 13:
                System.out.println("King");
                break;
                
        
        }
        
        System.out.println(" of " +Suit);
    }
}