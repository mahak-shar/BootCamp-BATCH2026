//Count Inversions in an array
import java.util.*;
public class Ques15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        //brute
        int cnt = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
