import java.util.Random;

public class Dice {
    public int numFaces;
    public Random rand;

    public Dice(int faces) {
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(1, (this.numFaces + 1));
    }

    public String toString() {
        return "d" + this.numFaces;
    }

}