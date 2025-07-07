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
        spyHelper(num);
        perfect(num);
        armstrong(num);
        magicNumber(num);
        strongNumber(num);

        if(checkPrime(num)) System.out.println("Prime");
        else System.out.println("Not prime");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcdHelper(a, b);
        int lcm = lcmHelper(a, b);
        System.out.println("GCD OF " + a + " and" + b + " : " + gcd);
        System.out.println("LCM OF " + a + " and" + b + " : " + lcm);
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

    //Find gcd
    public static int gcdHelper(int a, int b){
        if(b == 0) return a;
        return gcdHelper(b, a%b);
    }

    //Find lcm
    public static int lcmHelper(int a, int b){
        int gcd = gcdHelper(a, b);
        return (a*b)/gcd;
    }

    //Check Spy Number
    public static void spyHelper(int num){
        int sum = 0;
        int product = 1;
        while(num != 0){
            int rem = num%10;
            sum += rem;
            product *= rem;
            num = num/10;
        }
        if(sum == product) System.out.println("Spy Number !!");
        else System.out.println("Not a Spy Number !!");
    }

    //Check Perfect Number
    public static void perfect(int num){
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num % i == 0) sum +=i;
        }
        if(sum == num) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect number");
    }

    //Check Prime
    public static boolean checkPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false; //2 is only even prime, it is checked in above line
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num % i ==0) return false;
        }
        return true;
    }

    //check armstrong number
    public static void armstrong(int num){
        int temp = num;
        int cnt = 0;
        //count total number of digits
        while(temp != 0){
            cnt++;
            temp = temp/10;
        }
        temp = num;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10;
            sum += Math.pow(rem, cnt);
            temp = temp/10;
        }
        if(sum == num) System.out.println("Armstrong number !!");
        else System.out.println("Not a armstrong number");
    }

    //count digits
    public static int countDigit(int num){
        int digit = 0;
        while(num != 0){
            digit++;
            num = num/10;
        }
        return digit;
    }

    //check magic number
    public static void magicNumber(int num){
        int sum = 0;
        while(countDigit(num) != 1){
            while(num != 0){
                int rem = num % 10;
                sum += rem;
                num = num /10;
            }
            num = sum;
            sum = 0;
        }
        if(num == 1) System.out.println("Magic Number !!");
        else System.out.println("Not a Magic Nummber");
    }

    //check Strong number
    public static void strongNumber(int num){
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum += factFun(rem); //using already defined factorial function 
            temp = temp /10;
        }
        if(num == sum) System.out.println("Strong Number");
        else System.out.println("Not a strong number");
    }
    
}