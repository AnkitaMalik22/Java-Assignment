package Array;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3,4,5,1,2};
boolean isTrue=true;
        for(int i :nums){
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    isTrue=true;
                }
                else{
                    isTrue=false;
                }
            }
        }
        System.out.println(isTrue);

    }
}
