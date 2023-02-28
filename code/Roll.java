import java.util.Arrays;

public class Roll {

   public static void main(String[] args) {
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[0]); //parsed args[0] and args[1] into integers, and changed the order since that how it was in the example
        
        Dice dice = new Dice(n); //cahnged the number of faces from 6 to n
        
        int[] rolls = new int[k]; //made rolls[] lengths k
        int sum=0;//gave int sum a initial value of 0

        for (int i = 0; i < k; i++) {
            int x = dice.roll();//The program was rolling the dice twice for the sum and array, so I changed it to just one roll
            
            rolls[i] = x;
            sum += x;
        }

        System.out.println(k + dice.toString() + ": " + sum + " " + Arrays.toString(rolls)); //changed some spacing

   } 
}
