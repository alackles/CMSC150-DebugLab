import java.util.Random;

public class Dice {
    private int numFaces;
    private Random random;

    public Dice(int numFaces) {
        this.numFaces = numFaces;
        random = new Random();
    }

    public int roll() {
        return random.nextInt(numFaces) + 1;
    }

    public String toString() {
        return "d" + numFaces;
    }
}


// Alec Nguyen, CMSC 150




