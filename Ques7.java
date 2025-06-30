//MOVE ALL ZEROES TO THE END IN THE ARRAY
import java.util.*;
public class Ques7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = sc.nextInt();
        System.out.println("Initial Array : ");
        for(int i=0;i<n;i++) System.out.print(nums[i] + " ");
        System.out.println("Moving all the zeroes to the end");
        int it = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[it];
                nums[it] = nums[i];
                nums[i] = temp;
                it++;
            }
        }
        for(int i=0;i<n;i++) System.out.print(nums[i] + " ");
    }
}
