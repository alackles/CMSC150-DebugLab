import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //parseInt from String
        int k = Integer.parseInt(args[1]); //pareInt from String
        
        Dice dice = new Dice(k); //changed parameter to k
        
        int[] rolls = new int[k];
        int sum = 0; //Sum set to 0

        for (int i = 0; i < k; i++) {
            rolls[i] = dice.roll();
            sum += dice.roll();
        }

        System.out.println(n + dice.toStringMethod() + ": " + sum + Arrays.toString(rolls)); //changed to dice.toStringMethod
                                                                                            //changed k to n to produ e correct output

   } 
}
