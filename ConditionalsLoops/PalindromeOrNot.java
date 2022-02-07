package ConditionalsLoops;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int num,r,sum=0,temp;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        num=in.nextInt();
        temp=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Palindrome Number ");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
