class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       // int[]arr=new int[nums.length];
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
        if(nums[i]%2 != 0){
            swap(nums,i,j);
          
            j+=2;
            }
        else {
        i+=2;
            }
        }
        return nums;
        }
    
        
      public void swap(int[]arr,int i,int j){
          int k=arr[i];
          arr[i]=arr[j];
          arr[j]=k;
          }
        }
        