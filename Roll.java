public class Roll {
    public static void main(String[] args) {

        int numDice = Integer.parseInt(args[0]);
        int numFaces = Integer.parseInt(args[1]);

        Dice dice = new Dice(numFaces);

        int sum = 0;
        int[] rolls = new int[numDice];

            for (int i = 0; i < numDice; i++) {
                int roll = dice.roll();
                sum += roll;
                rolls[i] = roll;
            }

        System.out.print(numDice + dice.toString() + ": " + sum + " [");
            for (int i = 0; i < numDice; i++) {
                System.out.print(rolls[i]);
                if (i != numDice - 1) {
                    System.out.print(",");
                }
            }
        System.out.println("]");
        
    }
}



// Alec Nguyen, CMSC 150




