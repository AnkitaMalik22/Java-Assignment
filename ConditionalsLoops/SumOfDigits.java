package ConditionalsLoops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num,i=1,sum=0,digit;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        num=in.nextInt();

     while(num>0){
                 digit=num%10;
                 sum+=digit;
                 num=num/10;

     }
        System.out.println("Sum Of Digits : "+ sum);

    }
}
