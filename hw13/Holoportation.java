//This code will 
//JohnDerek Daniels
//CSE 002 Sect.111
//April 3th 2016

import java.util.Random;
import java.util.Scanner;

public class Holoportation {
    public static void main(String[] args) {
        
    Scanner input =  new Scanner (System.in);
        
    String[][][] Array1= soRandom();
    
    for(int i = 0; i < Array1.length; i++){
        for (int j = 0; j < Array1[i].length; j++){
            for (int k = 0; k < Array1[i][j].length; k++){
                Array1[i][j][k] = coder();
            }
        }
    }
    
    print(Array1);
    
    System.out.println("");
    
    String[][][] Array2 = soRandom();
    
    holoport(Array2,Array1);
    print(Array2);
    
    System.out.println("Enter the value you wish to search for");
    String key = input.nextLine();
    
    sampling(Array2, key);
    
    
        
    }
    
    public static String[][][] soRandom(){
        String[][][] firstArray = 
        new String[(int)((Math.random() * 9) + 1)][(int)((Math.random() * 9) + 1)][(int)((Math.random() * 9) + 1)];
        return firstArray;
    }
    
    public static String coder(){
        Random r = new Random();
        char firstX = (char) (r.nextInt(26) + 'A');
        char secondX = (char) (r.nextInt(26) + 'A');
        
        String finalString = firstX+""+secondX;
        
        for(int i = 0; i < 4; i++){
            finalString += (int)(Math.random() * 9);
        }
        return finalString;
    }
    
    public static void print(String Stringz[][][]){
        for(int i = 0; i < Stringz.length; i++){
            for (int j = 0; j < Stringz[i].length; j++){
                System.out.print("[");
                for (int k = 0; k < Stringz[i][j].length; k++){
                    System.out.print(Stringz[i][j][k]);
                    if (k < (Stringz[i][j].length - 1)){
                        System.out.print(" , ");
                    }
                    else {
                        System.out.print("]");
                    }
                }
                if (j < (Stringz[i].length - 1)){
                    System.out.print(" | ");
                }
            }
            if (i < (Stringz.length - 1)){
                System.out.print("---");
            }
        }
        System.out.println("");
    }
    
    public static String[][][] holoport(String ArrayTo[][][], String ArrayFrom[][][]){
        for (int i = 0; i < ArrayTo.length; i++){
            int a = ArrayFrom.length;
            int j = 0;
            if (i < a){
                for (j = 0; j < ArrayTo[i].length; j++){
                    int b = ArrayFrom[i].length;
                    if (j < b){
                        for (int k = 0; k < ArrayTo[i][j].length; k++){
                            int c = ArrayFrom[i][j].length;
                            if (k < c){
                                ArrayTo[i][j][k] = ArrayFrom[i][j][k];
                            }
                            else{
                                ArrayTo[i][j][k] = "$$$$$$";
                            }
                        }
                    }
                    else{
                        for (int k = 0; k < ArrayTo[i][j].length; k++){
                            ArrayTo[i][j][k] = "$$$$$$";
                        }
                    }
                }
            }
            else {
                for (int k = 0; k < ArrayTo[i][j].length; k++){
                    ArrayTo[i][j][k] = "$$$$$$";
                }
            }    
            
            for (j = 0; j < ArrayTo[i].length; j++){
                int b = ArrayFrom[i].length;
                int q = ArrayTo[i].length; 
                if (q < b){
                    for (int k = 0; k < ArrayTo[i][j].length; k++){
                        int c = ArrayFrom[i][j].length;
                        int y = ArrayTo[i][j].length;
                        if (y < c){
                            ArrayTo[i][j][k] = ArrayFrom[i][j][k];
                        }
                        else{
                            ArrayTo[i][j][k] = "$$$$$$";
                        }
                    }
                }
                else{
                    for (int k = 0; k < ArrayTo[i][j].length; k++){
                        ArrayTo[i][j][k] = "$$$$$$";
                    }
                }
                for (int k = 0; k < ArrayTo[i][j].length; k++){
                        int c = ArrayFrom[i][j].length;
                        int w = ArrayTo[i][j].length;
                        if (w < c){
                            ArrayTo[i][j][k] = ArrayFrom[i][j][k];
                        }
                        else{
                            ArrayTo[i][j][k] = "$$$$$$";
                        }
                    }
            }
        }
        return ArrayTo;
    }
    
    public static void sampling(String SearchArray[][][], String SearchValue){
        boolean found = false;
        int count = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        while (found == false && count < SearchArray.length) {
            int count1 = 0;
            while (found == false && count1 < SearchArray[count].length) {
                int count2 = 0;
                while (found == false && count2 < SearchArray[count][count1].length) {
                    if (SearchArray[count][count1][count2].equals(SearchValue)) {
                        found = true;
                        x = count;
                        y = count1;
                        z = count2;
                    }
                }
            }
        }
        
        if (found) {
            System.out.println("(" + x + ", " + y + ", " + z + ")");
        }
        else {
            System.out.println("Code not found");
        }
    }
}
   
    
    
    



        
    
    
