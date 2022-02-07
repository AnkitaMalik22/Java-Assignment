package ConditionalsLoops;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        double p,r,y,fiv;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The present value : ");
       p=in.nextDouble();
        System.out.println("Enter The interest rate : ");
        r=in.nextDouble();
        System.out.println("Enter The time period in years : ");
        y=in.nextDouble();
        fiv =p*Math.pow((1+r/100),y);
        System.out.println("Your Future Investment : "+fiv);
    }
}
