import java.util.Random; //import java.util.random module

public class Dice {
    public int numFaces;
    public Random rand;

    public Dice(int faces) { //added type int before faces
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces + 1); //added 1 to set range to right number
    }

    public String toStringMethod() { //renamed method so Arrays still can use the default toString Method in the Roll class
        return "d" + this.numFaces; //added semi column and return statement, removed print command
    }

}