import java.util.Random; //imported Random

public class Dice {
    public int numFaces;
    public Random rand;

    public Dice(int faces) { //declared faces as type int
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces)+1; //added one to roll since it was including 0 and excluding max before
    }

    public String toString() { //Changed from type void to String
        return "d" + this.numFaces; //Changed from print to return statement
    }

}