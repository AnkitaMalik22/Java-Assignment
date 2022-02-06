package ConditionalsLoops;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        int ncr,npr;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter The value of n:");
        int n=in.nextInt();
        System.out.println("Enter The value of r:");
        int r=in.nextInt();
//        ncr=(fact(n))/(fact(r)*fact(n-r));

        npr=(fact(n))/(fact(n-r));
        ncr=npr/fact(r);
        System.out.println("NCR : " +ncr);        System.out.println("NPR: " +npr);

    }
    public static int fact( int num){
        int fact=1;
        for (int i=1;i<=num;i++){
            fact *= i;

        }
        return fact;
    }
}
