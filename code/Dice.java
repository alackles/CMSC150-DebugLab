import java.util.Random;    //Importing random class
public class Dice {
    public int numFaces;
    public Random rand;

    public Dice(int faces) {    //Declared faces as an int
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces) + 1; //Added one to returned value because rolling zero is impossible, nextInt is exclusive with argument
    }

    public String toString() {    //Changed method to return String
        return "d" + this.numFaces;    //Not printing, returning string

    }

}