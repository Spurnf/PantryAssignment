package pantry;

import java.util.Scanner;

public class PantryTester {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = -1;
        int amountJam;
        Jam gooseberry = new Jam("Gooseberry", 12, 4, 7, 86);
        Jam crabApple = new Jam("Crab Apple", 8, 30, 9, 99);
        Jam rhubarb = new Jam("Rhubarb", 16, 31, 10, 99);
        Pantry pantry = new Pantry(gooseberry, crabApple, rhubarb);
        
        System.out.println("Welcome to Mother Hubbard's Pantry!");
        
        while (true) {
            
            System.out.println("\nThe jams are:");
            pantry.displayPantry();
            System.out.println("\nEnter your selection (1, 2, or 3):");
            input = sc.nextInt();
            while (input != 1 && input != 2 && input != 3 && input != -1) {
                System.out.println("That is not a valid input.");
                System.out.println("\nEnter your selection (1, 2, or 3):");
                input = sc.nextInt();
            }
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
