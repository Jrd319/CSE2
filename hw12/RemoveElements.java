//This code will remove and delete elements from an array
//JohnDerek Daniels
//CSE 002 Sect.111
//April 19th 2016

import java.util.Scanner;  //given code

public class RemoveElements{
    public static void main(String [] arg){
        
	Scanner scan=new Scanner(System.in);
	
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    
	String answer="";
	
	do{
	    
  	System.out.println("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is: ";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	num = newArray1;
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
    }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
public static int[] delete(int num[],int index){ //deletes a code in specific location
      
    int skip = index; //puts the position in new var

      
    if (skip>=0 && skip<10){ //if the position in between 0 and 10
        int[] out1 = new int[9]; // creates new array
        for (int i = 0; i <= 9; i++) { //for loop for new array
            if(i == skip){ //when i equals position
               continue; //skip that iteration
            }
            else if(i > skip){ //when i is larger than position
                out1[i - 1] = num[i]; //new array position equals var from one position before
            }
            else{ //before i equals position
                out1[i] = num[i]; //new array is the same as old array
            }
      }
    System.out.println("Index "+skip+" element is removed");
    return out1; //return new array
    }
    else { //when the postion is not between correct values
        int[] out1 = new int[10];
        for (int i = 0; i < 10; i++){
            out1[i] = num[i]; //the arrays are the same
        }
    System.out.println("The index is not valid.");
    return out1;
    }

}

public static int[] randomInput(){
    int[] num = new int[10]; //creates new array
    for (int k = 0; k < 10; k++) { //every element in array is random
        num[k] = (int)(Math.random() * 10);
    }
    return num;
}

public static int[] remove(int num[], int target){
    
    int counter = 0; //creates counter
    int bottle = num.length; //takes length of array
    for(int j = 0; j < bottle; j++){
        if (num[j] == target) {
            counter++; //adds one to counter for everytime element in array is equals to target number
        }
        else{
        }
    }
    int lengthz = num.length - counter; //find length of new array
    int[] final1 = new int[lengthz]; //create array with new length
    int g = 0; //create new counter
    
    if (bottle < 10) { //if the length of is less than 10
    for (int i = 0; i <= (lengthz + (counter - 1)); i++) {
            if(num[i] == target){ //every time array equals the target number
                g++; //add one to counter
               continue; //skip to next iteration
               
            }
            else if(g > 0){ //after each time a target number is met
                final1[i - g] = num[i]; //new array is equal to the old array
            }
            else{
                final1[i] = num[i]; //before the target is met both arrays are the same
            }
      }
     System.out.println("Element "+target+" has been found");
    }
    else if (counter > 0 && bottle == 10){ //if the length is 10 and counter is not 0
        for (int i = 0; i <= (lengthz + (counter - 1)); i++) {
            if(num[i] == target){
                g++; //same process
               continue;
               
            }
            else if(g > 0){
                final1[i - g] = num[i];
            }
            else{
                final1[i] = num[i];
            }
      }
    System.out.println("Element "+target+" has been found");
    }
    else if(counter == 0){ //if counter is zero
        for(int i = 0; i < bottle; i++){ //the array is the same as before
           final1[i] = num[i]; 
        }
        System.out.println("Element "+target+" was not found");
    }
    
    
    return final1;  //return
    
}




}
  
  


