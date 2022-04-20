class Solution {
    public int findPeakElement(int[] nums) {
        //1,2,3,1
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
    }
            else if(nums[mid]>nums[mid+1]){
                end=mid;
                }
            }
        return start;
    }
}