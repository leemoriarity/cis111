public class Collisions {
    public static void main(String args[]) {
    
        // Declare Variables    
        int same = 0; // count number of times particles are in same position
        // Particle 1 with 100,000 maximum steps and boundary of 2,000,000 with starting position (-3,0)
        RandomWalk p1 = new RandomWalk(100000, 2000000, -3, 0);
        // Particle 2 with 100,000 maximum steps and boundary of 2,000,000 with starting position (3,0)
        RandomWalk p2 = new RandomWalk(100000, 2000000, 3, 0);

        // For loop for each step
        for (int i = 0; i < 100000; i++) {
            p1.takeStep();
            p2.takeStep();
            if (samePosition(p1, p2))
                same++;
        }
        // Output number of times particles collide
        System.out.println("The number of times the two particles collide is: " + same);
    }
    
    // samePosition static method
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY())
            return true;
        else
            return false;
    }
}