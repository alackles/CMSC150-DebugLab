import java.util.Random;

public class DiceFixed {
    public int numFaces;
    public Random rand;

    public DiceFixed(int faces) {
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces) + 1;
    }

    public String toString() {
        return "d" + this.numFaces;
    }
}
