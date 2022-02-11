package Functions;

import java.util.Scanner;

public class PrimeOrNot {
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++)
            if(num%i==0)
                return false;


                return true;
    }
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num= input.nextInt();
        if(isPrime(num)){
            System.out.println("The Number Is Prime ");
        }
        else{
            System.out.println("The Number Is Not Prime ");

        }

    }

}

