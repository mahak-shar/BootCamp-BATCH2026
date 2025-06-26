//REVERSE AN ARRAY USING RECURSION
import java.util.*;
public class Ques3 {
    public static void main(String[] args){
        int[] nums = {5, 3, 1, 4, 2, 7, 6};
        helper(nums, 0, nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void helper(int[] nums, int start, int end){
        if(start >=  end) return;
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        helper(nums, start+1, end-1);
    }
}
