package pantry;

import java.util.Scanner;

public class PantryTester {
    
    public static void main(String[] args) {
        
        //Scanner Object
        Scanner sc = new Scanner(System.in);
        
        //User input variables
        int input;
        int amountJam;
        
        //Jam Objects that are created
        Jam gooseberry = new Jam("Gooseberry", 12, 4, 7, 86);
        Jam crabApple = new Jam("Crab Apple", 8, 30, 9, 99);
        Jam rhubarb = new Jam("Rhubarb", 16, 31, 10, 99);
        
        //Pantry object
        Pantry pantry = new Pantry(gooseberry, crabApple, rhubarb);
        
        System.out.println("Welcome to Mother Hubbard's Pantry!");
        
        //Infinite loop with sentinel value of -1
        while (true) {
            
            System.out.println("\nThe jams are:");
            pantry.displayPantry();
            System.out.println("\nEnter your selection (1, 2, or 3):");
            input = sc.nextInt();
            
            //Checks validity of user input
            while (input != 1 && input != 2 && input != 3 && input != -1) {
                System.out.println("That is not a valid input.");
                System.out.println("\nEnter your selection (1, 2, or 3):");
                input = sc.nextInt();
            }
            
            //Checks for sentinel value
            if (input == -1) {
                System.out.println("Good-bye");
                break;
            }
            System.out.println("Enter amount to spread:");
            amountJam = sc.nextInt();
            pantry.spreadJamJar(input, amountJam);
            
        }
        
    }
    
}
