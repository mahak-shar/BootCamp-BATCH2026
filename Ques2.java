//REVERSE AN ARRAY USING ITERATION
public class Ques2 {
    public static void main(String[] args){
        int [] nums = {5, 3, 1, 4, 2, 7, 6};
        int low = 0, high = nums.length-1;
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low ++;
            high --;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
