import java.util.Random;

public class RandomWalk {

    // Declare variables
    private int x; // x coordinate
    private int y; // y coordinate
    private int maxSteps; // maximum number of steps in a walk
    private int numSteps; // current number of steps
    private int maxCoord; // maximum x and y coordinates
    private int maxDistance; // maximum distanse traveled
    private Random r = new Random(); // random int variable

    // Constructor with maximum number of steps and boundary
    public RandomWalk(int max, int edge) {
        x = 0;
        y = 0;
        maxSteps = max;
        maxCoord = edge;
    }
    
    // Constructor with maximum number of steps, boundary, and starting position
    public RandomWalk(int max, int edge, int startX, int startY) {
        x = startX;
        y = startY;
        maxSteps = max;
        maxCoord = edge;
    }
    
    // toString Method
    public String toString() {
        return "Steps: " + numSteps + "; Postition: (" + x + "," + y + ")";
    }
    
    // takeStep method
    public void takeStep() {
        int num = r.nextInt(4);
        switch (num) {
            case 0:  x++;
                     maxDistance = max(maxDistance, x);
                     break;
            case 1:  x--;
                     maxDistance = max(maxDistance, x);
                     break;
            case 2:  y++;
                     maxDistance = max(maxDistance, y);
                     break;
            case 3:  y--;
                     maxDistance = max(maxDistance, y);
                     break;
        }
        numSteps++;
    }
    
    // moreSteps method 
    public boolean moreSteps() {
        if (numSteps < maxSteps)
            return true;
        else
            return false;
    }
    
    // inBounds method
    public boolean inBounds() {
        if (x < maxCoord && y < maxCoord && x > -(maxCoord) && y > -(maxCoord))
            return true;
        else
            return false;
    }
    
    // walk method
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    // getX accessor method
    public int getX() {
        return x;
    }
    
    // getY accessor method
    public int getY() {
        return y;
    }
    
    // max method
    private int max(int num1, int num2) {
        return Math.max(Math.abs(num1), Math.abs(num2));
    }
    
    // getMaxDistance accessor method 
    public int getMaxDistance() {
        return maxDistance;
    }
}