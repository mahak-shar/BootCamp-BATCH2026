//REARRANGE THE NEGATIVE AND POSITIVE ITERATIVELY
import java.util.*;
public class Ques12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i] = sc.nextInt();
        
        Queue<Integer> neg = new LinkedList<>();
        Queue<Integer> pos = new LinkedList<>(); 
        for(int i=0;i<n;i++){
            if(nums[i] < 0) neg.offer(nums[i]);
            else pos.add(nums[i]);
        }
        int i = 0;
        while(!neg.isEmpty()) nums[i++] = neg.poll();
        while(!pos.isEmpty()) nums[i++] = pos.poll();
        for(int j=0;j<n;j++) System.out.print(nums[j] + " ");
        System.out.println();
    }
}
