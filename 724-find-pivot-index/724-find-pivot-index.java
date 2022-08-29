class Solution {
    public int pivotIndex(int[] nums) {
    

        int sum=0;
        int leftSum=0;
        int s=0;
        while(s<nums.length){
            sum+=nums[s];
            s++;
        }
        for(int i=0;i<nums.length;i++){
            if(leftSum==sum-leftSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}