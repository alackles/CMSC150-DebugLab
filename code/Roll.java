import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);   // changed to convert args Strings to Integer values
        int k = Integer.valueOf(args[1]);
        
        Dice dice = new Dice(k);    // changed value of numFaces given to Dice to k variable rather than a constant '6'
        
        int[] rolls = new int[n];   // changed to set rolls array length to input value n
        int sum = 0;    // set sum to 0 at beginning

        for (int i = 0; i < n; i++) {   // changed from i < k to i < n - should be number of dice, not number of faces
            int roll = dice.roll(); // only rolls once for both rolls[i] and sum - added this int variable to ensure this
            rolls[i] = roll;
            sum += roll;
        }

        System.out.println(n + dice.toString() + ": " + sum + " " + Arrays.toString(rolls));
            // changed first variable printed from k to n, added space after colon, and added space between sum & printed array
   } 
}
