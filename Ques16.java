//EQUILIBRIUM INDEX IN AN ARRAY
import java.util.*;
public class Ques16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int equiIndex = findEquiIndex(arr);
        System.out.println(equiIndex);
    }
    public static int findEquiIndex(int[] arr){
        int n = arr.length;
        //prefixSum
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i=1;i<n;i++) prefixSum[i] = prefixSum[i-1] + arr[i];
        //suffixSum
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--) suffixSum[j] = suffixSum[j+1] + arr[j]; 
        for(int i=0;i<n;i++){
            if(prefixSum[i] == suffixSum[i]) return i;
        }
        return -1; //if not found
    }
}
