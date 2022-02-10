package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number  : ");
       num= input.nextInt();
       String isEven=evenOdd(num);
        System.out.println("The Number is : "+isEven );
    }
    public static String evenOdd(int num){
        String isEven;
        if(num%2==0){
            isEven="even";
        }
        else{
            isEven="odd";
        }
        return isEven;
    }

}
