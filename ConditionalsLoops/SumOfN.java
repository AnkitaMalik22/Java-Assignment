package ConditionalsLoops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        System.out.println("How Many Numbers You Want To Enter ?");
        Scanner input = new Scanner(System.in);
        int count=input.nextInt();
        double sum=0;
 double[] arr=new double[count];
for(int i=0;i<arr.length;i++){
    System.out.print("Enter The Number :");
    arr[i]= input.nextDouble();
    sum+=arr[i];
}
input.close();

System.out.println("Sum of "+arr.length+" numbers is : "+ sum);


    }
}
