import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        Integer n = Integer.valueOf(args[0]);   //Using Integer wrapper class to convert strings to integers
        Integer k = Integer.valueOf(args[1]);
        
        Dice dice = new Dice(k);    //Should construct a die with k faces
        
        int[] rolls = new int[n];   //Created int array object of length (number of rolls)
        int sum = 0;                //Set initial sum to zero

        for (int i = 0; i < k; i++) {
            rolls[i] = dice.roll();
            sum += dice.roll();
        }

        System.out.println(n + dice.toString() + ": " + sum + " " + Arrays.toString(rolls)); //n to start, not k. Formatting spaces added. 

   } 
}
