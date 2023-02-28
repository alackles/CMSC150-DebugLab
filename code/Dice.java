public class Dice {
    public int numFaces;
    public Random rand;

    public Dice(faces) {
        this.numFaces = faces;
        this.rand = new Random();
    }

    public int roll() {
        return rand.nextInt(this.numFaces);
    }

    public void toString() {
        System.out.println("d" + this.numFaces)
    }

}