import java.util.*;
public class Classtask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        checkOddEven(num);
        System.out.println("Factorial is: " + factFun(num));
        System.out.println("Reverse number: " + reverse(num));
        palindrome(num);
    }
    //Check whether the number is even or odd
    public static void checkOddEven(int num){
        if(num % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
    //find the factorial of the number
    public static long factFun(int n){
        if(n==0) return 1;
        return n* factFun(n-1);
    }
    //reverse the number
    public static int reverse(int num){
        int revNum = 0;
        while(num !=0){
            int rem = num % 10;
            num = num/10;
            revNum = revNum * 10 + rem;
        }
        return revNum;
    }
    //check palindrome
    public static void palindrome(int num){
        if(num == reverse(num)) System.out.println("It is a Palindrome");
        else System.out.println("Not a palindrome");
    }
    
}