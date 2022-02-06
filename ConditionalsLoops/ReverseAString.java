package ConditionalsLoops;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        String reverseStr="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The string :");
        String str=in.nextLine();
     for (int i=str.length()-1;i>=0;i--){
         reverseStr += str.charAt(i);

     }
        System.out.println("Reverse String:\n" + reverseStr);
    }
}
