import java.util.Arrays;

public class Roll {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        Dice dice = new Dice(6);

        int[] rolls = new int[k];
        int sum = 0;

        for (int i = 0; i < k; i++) {
            rolls[i] = dice.roll();
            sum += rolls[i];
        }

        System.out.println(k + " " + dice.toString() + ":" + sum + " " + Arrays.toString(rolls));
    }
}
