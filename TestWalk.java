import java.util.Scanner;

public class TestWalk {
    public static void main(String args[]) {

        int maxSteps; // maximum number of steps in a walk
        int maxCoord; // the maximum x and y coordinate
        int x, y; // starting x and y coordinates for a walk

        Scanner scan = new Scanner(System.in);
        
        // Get user input
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square for person 2: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps for person 2: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with a space between for person 2: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        // Person 1 with maximum steps of 5 and boundary of 10
        RandomWalk p1 = new RandomWalk(5, 10);
        // Person 2 with variables set by user
        RandomWalk p2 = new RandomWalk(maxSteps, maxCoord, x, y);
        
        // For loop for first 5 steps
        for (int i = 0; i < 5; i++) {
            p1.takeStep();
            p2.takeStep();
            System.out.println("Person 1: " + p1);
            System.out.println("Person 2: " + p2);
        }
        
        // Output max distance of each person
        System.out.println("\nMax distance person 1: " + p1.getMaxDistance());
        System.out.println("Max distance person 2: " + p2.getMaxDistance());

        // Person 3 with max steps of 200 and boundary of 10
        RandomWalk p3 = new RandomWalk(200, 10);
        p3.walk();
        System.out.println("\nPerson 3: " + p3);
        System.out.println("Max distance person 3: " + p3.getMaxDistance());

    }
}