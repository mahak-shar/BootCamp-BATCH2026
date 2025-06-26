//CHECK IF ARRAY IS SORTED OR NOT
import java.util.*;
public class Ques6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        //Printing..
        for(int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        //Checking..
        boolean flag = true;
        for(int i=1;i<n;i++){
            if(nums[i-1] >  nums[i]){
                System.out.println("Array is not sorted");
                flag = false;
                break;
            }
        }
        if(flag == true) System.out.println("Array is sorted");
    }
}
