package Functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age  : ");
        age= input.nextInt();
        System.out.println( checkEligibility(age));

    }
    public static String checkEligibility(int age){
        String isEligible;
        if(age>=18){
            isEligible="Eligible to vote";
        }
        else{
            isEligible="Not Eligible to vote";
        }
        return isEligible;

    }
}
