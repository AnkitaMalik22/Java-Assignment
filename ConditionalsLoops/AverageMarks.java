package ConditionalsLoops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        double total=0,avg;
        System.out.println("Enter No of Subjects : ");
        int noOfSubjects=in.nextInt();

        int[] arr=new int[noOfSubjects];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Sub( "+ i+1 +" ) Marks : ");
           arr[i]=in.nextInt();
         total += arr[i];

        }
        avg=total/noOfSubjects;
        System.out.println("Average Marks : "+avg);

    }
}
