
// COUNT THE FREQUENCY OF EACH ELEMENT IN ARRAY
import java.util.*;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Printing array..
        for (int k = 0; k < n; k++){
            System.out.print(nums[k] + " ");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            map.merge(nums[j], 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int key = it.getKey();
            int val = it.getValue();
            System.out.println("Freq of " + key + " in this array: " + val);
        }
    }
}
