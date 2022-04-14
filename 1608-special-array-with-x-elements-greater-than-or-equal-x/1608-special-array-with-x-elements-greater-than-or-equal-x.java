class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int len=nums.length;
        int end=len-1;
        
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]>=len-mid){    
 if(mid==0 || nums[mid-1]<len-mid ){   
     return len-mid;
                 }
               else {
                  end=mid-1;
                    }
                }
                else{
                    start=mid+1;
                    }
                    
                    }
      
        return -1;
    }
}