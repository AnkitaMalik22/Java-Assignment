package ConditionalsLoops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        int p=input.nextInt();
        System.out.println("Enter Annual Interest Rate :");
        double r=input.nextDouble();
        System.out.println("Enter time(the money invested or borrowed for) : ");
        int t= input.nextInt();
        System.out.println("Enter Number of times interest compounded per unit : ");
        int n= input.nextInt();
        double amount=p*Math.pow(1+r/n,n*t);
        double cInterest=amount-p;
        System.out.println("Compound Interest : " +cInterest);
        System.out.println("Amount After "+t+" Years "+amount);

    }

}
