package ConditionalsLoops;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Total amount : ");
        double amount= input.nextDouble();
        System.out.println("Enter Commission percentage : ");
        double percentage= input.nextDouble();
        double commission=(percentage/100)*amount;
        System.out.println("Your Commission Amount  : " + commission);



    }
}
