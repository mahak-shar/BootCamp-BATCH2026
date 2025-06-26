// Find the maximum and second maximum number in an array
import java.util.*;
public class Ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            if(arr[i] > secLargest && arr[i]<largest){
                secLargest = arr[i];
            }
        }
        System.out.println("Largest Element : " + largest);
        if(secLargest == Integer.MIN_VALUE){
            System.out.println("No second largest present");
        }
        else System.out.println("Second largest element :" + secLargest);
    }
}