import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        int n = args[0];
        int k = args[1];
        
        Dice dice = new Dice(6);
        
        int[] rolls;
        int sum;

        for (int i = 0; i < k; i++) {
            rolls[i] = dice.roll();
            sum += dice.roll();
        }

        System.out.println(k + dice.toString() + ":" + sum + Arrays.toString(rolls));

   } 
}
