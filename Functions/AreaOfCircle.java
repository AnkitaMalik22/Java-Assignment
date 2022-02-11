package Functions;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int r;
        double pi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = input.nextInt();
      pi=Math.PI;

        System.out.println("circumference = "+  calculateCircumference(r,pi));
        System.out.println("area= "+ calculateArea(r,pi));
    }
    public static double calculateArea(int radius,double pi){
        double area;
        area=pi*radius*radius;
        return area;
    }
    public static double calculateCircumference(int radius,double pi){
        double circumference;
        circumference=2*pi*radius;
        return circumference;
    }
}
