package ConditionalsLoops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int a,b,i,hcf=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The first value : ");
        a=in.nextInt();
        System.out.println("Enter The second  value : ");
        b=in.nextInt();
        for(i=1;i<=a || i<=b ;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }

        }
        System.out.println("HCF of given two numbers is : "+hcf);
    }
}
