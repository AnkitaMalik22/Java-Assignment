class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
 if(arr[mid]-1-mid<k){
     start=mid+1;
     }
            else{
                end=mid-1;
                }
        
       }
        
        return start+k;
    }
}