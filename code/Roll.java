import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        
        Dice dice = new Dice(k);
        
        int[] rolls = new int[n];
        int sum = 0;
        int currentRoll = 0;

        for (int i = 0; i < n; i++) {
            currentRoll = dice.roll(); 
            rolls[i] = currentRoll;
            sum = sum + currentRoll;
        }

        System.out.print(n);
        System.out.println(dice + " : " + sum + " " + Arrays.toString(rolls));

   } 
}
