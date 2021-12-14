import java.util.Scanner;

public class DrunkenWalk {
    public static void main(String args[]) {
    
        //Declare variables
        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk
        int numDrunks; // number of drunks
        int falls = 0; // count number of falls
        int succeed = 0; // count number of successful finishes

        Scanner scan = new Scanner(System.in);
        
        // Get user input
        System.out.println("\nDrunken Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the number of drunks: ");
        numDrunks = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        // For loop for each number of drunks
        for (int i = 0; i < numDrunks; i++) {
            RandomWalk drunk = new RandomWalk(maxSteps, maxCoord, x, y);
            drunk.walk();
            
            // If out of bounds
            if (!drunk.inBounds()) {
                falls++; // count number of falls
            }
            
            // If finishes in bounds
            if (drunk.inBounds()) {
                succeed++; // count numbers of successful walks
            }
            
            // Output last step and max distance of each drunk walk
            System.out.println("\nDrunk " + (i + 1) + " last step: " + drunk);
            System.out.println("Drunk " + (i + 1) + " max distance: " + drunk.getMaxDistance());
        }
        
        // Output number of falls and completions
        System.out.println("\nNumber of times the drunk fell: " + falls);
        System.out.println("Number of drunks that made it: " + succeed);
    }
}