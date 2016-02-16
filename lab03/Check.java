//This program takes a check that an group may recieve at a resturant
//It then splits it evenly and adds tip
//JohnDerek Daniels
//CSE 2 Sect. 111
import java.util.Scanner;
public class Check{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner( System.in );
        
        System.out.print("Enter the original cost of the check in the form of xx.xx: ");
        
        double checkCost = myScanner.nextDouble();
        
        System.out.print("Enter the percentage top that you wish to pay as a whole number (in the form xx): ");
        double tipPercent= myScanner.nextDouble();
        tipPercent /= 100;
        
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        totalCost = checkCost * (1+tipPercent);
        costPerPerson = totalCost / numPeople;
        dollars=(int)costPerPerson;
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
    }
}
