class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
                }
            else{
                end=mid;
                }
            }
        int newStart=start;
         start=0;
        end=nums.length-1;
        if(target>=nums[newStart] &&target<=nums[end]){
            start=newStart;
            }
        else{
            end=newStart;}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;}
            else if(nums[mid]<target){
                start=mid+1;
                }
            else{
                end=mid-1;
                }
            }
        return -1;
                
    }
}