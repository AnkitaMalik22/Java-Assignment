class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
        if(sum==
           target){ break;}
            else if(sum>target){
            

            j--;
            }
            
           else {
                i++;}
            }
     
        return new int[]{i+1,j+1};
        
    }
}