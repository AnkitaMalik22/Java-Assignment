package ConditionalsLoops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
//avg=totalruns/(innings-notout)
        int totalRuns,innings,notOut,match;
        double avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter No of matches played : ");
        match=in.nextInt();
        System.out.println("Enter Total Runs : ");
        totalRuns=in.nextInt();
        System.out.println("Enter Total innings : ");
        innings=in.nextInt();
        System.out.println("Enter Total  notOut : ");
        notOut=in.nextInt();
if(innings<match && notOut<=innings){
    avg=totalRuns/(innings-notOut);
    System.out.println("Batting Average : "+ avg);

}
else{
    System.out.println("please enter innings less than equal to matches and notout less than equal to innings");
}

    }
}
