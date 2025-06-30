
// MERGING OF TWO SORTED ARRAYS
import java.util.*;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++) arr1[i] = sc.nextInt();
        for(int i=0;i<n2;i++) arr2[i] = sc.nextInt();

        System.out.println("Initial First Array :");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Initial Second Array :");
         for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Array After Merging : ");
        int[] ans = new int[n1+n2];
        merge(n1, n2, arr1, arr2, ans);
        
        for(int i=0;i<ans.length;i++) System.out.print(ans[i] + " ");
    }
    public static void merge(int n1, int n2, int[] arr1, int[] arr2, int[] ans){
        int i = 0, j = 0, idx = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                ans[idx++] = arr1[i];
                i++;
            }
            else{
                ans[idx++] = arr2[j];
                j++;
            }
        }
        while(i < n1){
            ans[idx++] = arr1[i];
            i++;
        }
        while(j < n2){
            ans[idx++] = arr2[j];
            j++;
        }
    }
}
