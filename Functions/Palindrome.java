package Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int number=input.nextInt();
        if(isPalindrome(number)){
            System.out.println("The Number Is Palindrome ");
        }
        else{
            System.out.println("The Number Is Not Palindrome");

        }

    }
    public static boolean isPalindrome(int num){
        int temp,sum=0,r;
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        return temp==sum;
    }
}
