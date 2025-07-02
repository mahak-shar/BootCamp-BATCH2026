//Intersection and Union of 2 sorted array
import java.util.*;
public class Ques18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++) arr1[i] = sc.nextInt();
        for(int i=0;i<m;i++) arr2[i] = sc.nextInt();
        
        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);

    }
    public static void findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1) set.add(i);
        for(int i : arr2) set.add(i);
        ArrayList<Integer> union = new ArrayList<>(set);
        Collections.sort(union); 
        System.out.println("Union of 2 arrays : ");
        for(int i=0;i<union.size();i++) System.out.print(union.get(i) + " ");
        System.out.println();
    }
    public static void findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> iSet = new HashSet<>();
        for(int i : arr1) set1.add(i);
        for(int i : arr2){
            if(set1.contains(i)) iSet.add(i);
        }
        ArrayList<Integer> intersection = new ArrayList<>(iSet);
        Collections.sort(intersection);
        System.out.println("Intersection of 2 arrays : ");
        for(int i=0;i<intersection.size();i++) System.out.print(intersection.get(i) + " ");
        System.out.println();
    }
}
