import java.util.*;
public class Ques13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        //Using kadence algo
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int j=0;
        while(j<arr.length){
            currentSum += arr[j];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) currentSum = 0;
            j++;
        }
        System.out.println("Maximum subarray sum is : " + maxSum);
    }
}
