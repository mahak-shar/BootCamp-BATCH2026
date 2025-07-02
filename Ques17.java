//ROTATE ARRAY CLOCKWISE
import java.util.*;
public class Ques17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //array length
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("How much time you want to rotate :");
        int k = sc.nextInt(); 
        if(k==0) print(arr);
        k = k%n; //if k>n
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        print(arr);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}