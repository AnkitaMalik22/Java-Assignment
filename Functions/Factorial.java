package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int number=input.nextInt();
        System.out.println("Factorial of " + number+" is "+ fact(number));
    }
    public static int fact(int num){
        int fact=1;
        for( int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
