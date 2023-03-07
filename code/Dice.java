import java.util.Random; // imported Random class for RNG

public class Dice {
    public int numFaces;
    public Random rand = new Random();  // declared new Random

    public Dice(int faces) {    // added 'int' declaration in parameters
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces) + 1; // added 1 so that dice cannot roll 0 and can roll the max numFaces
    }

    public String toString() {  // changed return value from void to String
        return "d" + numFaces;  // changed from print statement to return; returns String
    }

}