package ConditionalsLoops;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        long amount,deppercent,year,afterdep,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Total amount : ");
      amount= input.nextLong();
        System.out.println("Enter Depreciation percentage : ");
        deppercent= input.nextLong();
        System.out.println("Enter No Of Years : ");
        year= input.nextLong();
        temp=amount;
        for(int i=0;i<year;i++){
        afterdep=((100- deppercent)*temp/100);
        System.out.println("After Depreciation Amount : "+afterdep);
    }
}
}

