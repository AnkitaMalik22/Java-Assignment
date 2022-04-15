class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int firstPos=findFirst(target,arr);
            
        int lastPos=findLast(target,arr);
        
        return new int[]{firstPos,lastPos};
     }  
    private int findFirst(int target,int[]arr){
        int start=0;
        int end=arr.length-1;
        int f=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
                }
            else if(arr[mid]<target){
                start=mid+1;
                }
            else{
    f=mid;   
                end=mid-1;}
            }
        return f;
        }
                
                
    
            
        
    public int findLast(int target,int[] nums){
       int start=0;
        int end=nums.length-1;
        int l=-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
    }
        else if(nums[mid]<target){
            start=mid+1;
            }
            
            else{
           l=mid;
                start=mid+1;
               }
            }
            return l;
        }
}