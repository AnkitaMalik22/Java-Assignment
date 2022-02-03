package ConditionalsLoops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        int x1=input.nextInt();
        System.out.println("Enter x2 : ");
        int x2=input.nextInt();
        System.out.println("Enter y1 : ");
        int y1=input.nextInt();
        System.out.println("Enter y2 : ");
        int y2=input.nextInt();
        double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The Distance is : "+ distance);
    }
}
