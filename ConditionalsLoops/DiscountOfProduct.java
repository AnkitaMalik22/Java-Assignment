package ConditionalsLoops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        System.out.println("Enter Total Amount Of Shoping : ");
        Scanner input= new Scanner(System.in);
        int totalAmount=input.nextInt();
        //discount on > $1000 shoping;
        int discount=50,costToPay=0;
        if(totalAmount>=1000){
            discount=(totalAmount*50)/100;
            costToPay=totalAmount-discount;
            System.out.println("Your Bill After Discount : " + costToPay);
        }
        else{
            System.out.println("Sorry! NO Discount Available");
        }

    }

}
