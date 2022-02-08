package ConditionalsLoops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,i=1,sum=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        num=in.nextInt();

        while(i<=num/2){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }

        if(sum==num){
            System.out.println(num+" is a Perfect Number");
        }
        else{
            System.out.println(num+" is not a Perfect Number");
        }
    }
}
