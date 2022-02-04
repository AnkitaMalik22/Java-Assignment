package ConditionalsLoops;

import java.util.Scanner;

public class calculateCGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Subjects : ");
        int n= input.nextInt();
        double[] marks= new double[n];
        System.out.println("Enter Marks:");
        for(int  i=0; i<n; i++){
            marks[i]= input.nextInt();

        }
        double[] grade=new double[n];
        double cgpa,sum=0;
        for(int i=0;i<n;i++){
            grade[i]=(marks[i]/10);

        }
        for(int i=0;i<n;i++){
           sum+= grade[i];

        }
        cgpa=sum/n;
        System.out.println("cgpa="+cgpa);
        System.out.println("percentage from cgpa"+cgpa*9.5);
    }
}
