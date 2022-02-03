package ConditionalsLoops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.print("Enter Unit : ");
        Scanner in = new Scanner(System.in);
        int unit=in.nextInt();
       int elBill=0;

        if(unit<=100){
            elBill=unit*10;
        }
        else if(unit<=200){
            elBill=(100*10)+(unit-100)*15;
        }
        else if(unit<=300){
            elBill=(100*10)+(100*15)+(unit-200)*20;
        }
        else if(unit>300){
            elBill=(100*10)+(100*15)+(100*20)+(unit-300)*25;
        }
        System.out.println("Your Electric Bill : " + elBill);
    }

}
