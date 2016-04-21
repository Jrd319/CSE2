//This code will take students' grades and shuffle then search for them
//JohnDerek Daniels
//CSE 002 Sect.111
//April 19th 2016

import java.util.Scanner;

public class CSE2Linear {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 15 ints for students’ final grades in CSE2: "); 
        
        int[] grades = new int[15]; //create new array for grades
        int X = 1;
        
        for (int i = 0; i < 15; i++ ){ //for loop for that runs for every grade
            if(input.hasNextInt()) { //check if what was entered was an int
                grades[i] = input.nextInt(); //if it was then assign it to the var
                if (grades[i] >= 0 && grades[i] <= 100) { //check if it fits between the two numbers
                    if (i > 0 && grades[i] >= grades[i - 1]){ //check if it was bigger than the last
                        X = 0;
                    }
                    else if (i == 0){ //unless it was the first one
                        X = 0;
                    }
                    else {
                        System.out.println("Your entry is not larger or equal to the last");
                        X = 1; //if it doesnt fit the criteria then break loop and print statement
                        break;
                    }
                }
                else {
                    System.out.println("Your entry is not between 0 and 100");
                    X = 1; //if it is between 0 and 100 break loop and print 
                    break;
                }
            }
            else {
                System.out.println("Your entry is not an integer");
                X = 1; //if its not an int break and print
                break;
            }
        }
        
        if (X == 0) { //when all the criteria are met enter the if 
            for (int i = 0; i < 15; i++) { //print out the array with all the grade values
                System.out.print(grades[i]);
                if (i < 14) {
                    System.out.print(", ");
                }
                else {
                    System.out.println("");
                }
            }
            
            System.out.println("Enter a grade you want to search for");
            
            int search = input.nextInt(); //new int with search value
            
            int low = 0; //create int for low variable
            int high = grades.length - 1; //set high var to length of array - 1
            int it = 0; //creat counter
            int mid2 = 0;
            
            while (high >= low) { //run loop while high var is larger equal to low var
                it++;
                int mid = (low + high) / 2; //create mid point in array
                mid2 = mid;
                if (search < grades[mid]) { //if search var is less than value of mid point 
                    high = mid - 1; //new high var becomes 1 less than old mid
                }
                else if (search == grades[mid]) { //if search is equal to mid then print and break
                    System.out.println(search+ " was found using " +it+ " iterations");
                    break;
                }
                else { //if  search var is greater than value of mid point
                    low = mid + 1; //than low point increases to one less than old mid 
                } 
                
            }
            
            if (search != grades[mid2]) { //after exits loop if search doesnt equal the mid value 
            System.out.println(search+ " was not found using " +it+ " iterations"); //print
            }

            
            
            for (int j =  0; j < 20; j++) { //scramble the grades
                int ranNum = (int)(Math.random() * 15);
                int ranNum2 = (int)(Math.random() * 15);
                int switchVar = grades[ranNum];
                grades[ranNum] = grades[ranNum2];
                grades[ranNum2] = switchVar;
            }
            
            System.out.println("Scrambled: ");
            
            for (int i = 0; i < 15; i++) { //print out the scrambled grade
                System.out.print(grades[i]);
                if (i < 14) {
                    System.out.print(", ");
                }
                else {
                    System.out.println("");
                }
            }
            
            System.out.println("Enter a grade you want to search for");
            
            int search2 = input.nextInt(); //new int with search value
            
            for (int i = 0; i < 15; i++) {
                if (grades[i] == search2) { //if the grade equals the search then print and break
                    System.out.println(search2+ " was found using " +(i + 1)+ " iterations");
                    break;
                }
                else if (grades[i] != search2 && i != 14){ 
                    continue;
                }
                else  { //if reaches the end
                    System.out.println (search2+ " was not found using 15 interations");
                }
            }
            
            
        }
        
    }
}