//FIND SUBARRAY WITH GIVEN SUM

import java.util.*;
public class Ques14 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //array length
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
         int target = sc.nextInt(); //given sum
        
        int sum = 0;
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(j<n){
            sum += arr[j];
            while(sum > target && i<j){
                sum -= arr[i];
                i++;
            }
            if(sum == target){
                ans.add(i+1);
                ans.add(j+1);
                break;
            }
            j++;
        }
        if(ans.size()==0) ans.add(-1);
        for(int k=0;k<ans.size();k++) System.out.print(ans.get(k) + " ");
        System.out.println();
     }
}
