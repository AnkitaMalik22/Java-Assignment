package Functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        int num;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        num=in.nextInt();
        System.out.println("your Grade = "+ checkGrade(num));
    }
    public static String checkGrade(int num){
        String grade="";
        switch (num/10)
        {
            case 10:
            case 9:
                grade="AA";
                break;
            case 8:
                grade="AB";
                break;
            case 7:
                grade="BB";
                break;
            case 6:
                grade="BC";
                break;
            case 5:
                grade="CD";
                break;
            case 4:
                grade="DD";
                break;
            default:
                grade="FAIL";
        }
        return grade;
    }
}
