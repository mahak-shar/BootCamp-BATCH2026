//FIND THE MISSING NUMBER FROM 0 TO N 
import java.util.*;
public class Ques8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int missed = missingNumber(arr);

        System.out.println("Missing Number is : " + missed);
        
    }
    public static int missingNumber(int[] arr){
        int n = arr.length;
        int total = n * (n+1) /2;
        int arraySum = 0;
        for(int it : arr) arraySum += it;
        return total - arraySum;
    }
}
