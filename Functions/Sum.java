package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Numbers  : ");
        a = input.nextInt();
        b = input.nextInt();

        System.out.println("sum= " +  sum(a,b));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
