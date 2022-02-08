package ConditionalsLoops;

public class EvenDays {
    public static void main(String[] args) {
        int i=1,augustDays=31,evenDays=0;
        while(i<augustDays){
            if(i % 2==0){
                evenDays++;
            }
            i++;

        }
        System.out.println("Kunal can go out "+evenDays+" days in August");
    }
}
