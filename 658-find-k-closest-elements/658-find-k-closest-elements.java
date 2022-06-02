class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
  List<Integer>list=new ArrayList<>();
        
       // for(int i=0;i<nums.length;i++){
            //arr.add(
            
       int[] arr=new int[2];
       int start=0;

        int end=nums.length-k;

        //int i=0;

        while(start<end){

     int  mid=start+(end-start)/2;
if(x-nums[mid]>nums[mid+k]-x){
      //  arr[i++]=nums[start];
            start=mid+1;

    } else{  
        end=mid;
    }
        }
     //  int j=0;
 for(int s=start ;s<start+k;s++){
            list.add(nums[s]);
                     }
      
    return list;
    }
}