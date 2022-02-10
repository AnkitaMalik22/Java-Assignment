package Functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Numbers  : ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        System.out.println("Maximum Number is: " +  max(a,b,c));
        System.out.println("Minimum Number is: " +  min(a,b,c));

    }
    public static int  max(int a,int b,int c){
        int max=a;
        if(b>max){
         max=b;
            if(c>b){
                max=c;
            }
        }
     return max;

    }
    public static int  min(int a,int b,int c){
        int min=a;
        if(b<min){
          min=b;
            if(c<b){
                min=c;
            }
        }
        return min;
    }
}
