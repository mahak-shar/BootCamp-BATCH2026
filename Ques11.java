// Leaders in an array - -A leader in an array is defined as an element that is strictly greater than all the elements to its right.

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        leader(nums, ans);

        for(int i=0;i<ans.size();i++) System.out.print(ans.get(i) + " ");
    }
    public static void leader(int[] nums, List<Integer> ans){
        int n = nums.length;
        int max = nums[n-1];
        ans.add(nums[n-1]);
        for(int i=n-2;i>=0;i--){
            if(nums[i] >= max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
    }
}
