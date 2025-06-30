//Left rotate the array by 'd' places
import java.util.*;
public class Ques9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt(); 
        System.out.println("Initial Array : ");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Enter the no. of places you want to left rotate the array:");
        int d = sc.nextInt(); 
        leftRotateByDPlaces(arr, d);

        System.out.println("After Rotating the array by " + d + "places : ");
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
    }
    public static void leftRotateByDPlaces(int[] arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
