package ConditionalsLoops;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        System.out.println("How Many Numbers You Want To Enter ?");
        Scanner input = new Scanner(System.in);
        int count=input.nextInt();
        double average=0;
 double[] arr=new double[count];
for(int i=0;i<arr.length;i++){
    System.out.print("Enter The Number :");
    arr[i]= input.nextDouble();
    average+=arr[i]/2;
}
input.close();

        System.out.println("Average of "+arr.length+" numbers is : "+ average);


    }
}
