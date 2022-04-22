class Solution {
    public int maxValue(int n, int index, int maxSum) {
        
        
maxSum-=n;
        int start=0,end=maxSum,mid;
        while(start<end){
            mid=(start+end+1)/2;
            if(test(n,index,mid)<=maxSum){
                start=mid;
            }
               else{
                   end=mid-1;
               }
               }
               return start+1;
               }
   private long test(int n, int index,int a){
       int b=Math.max(a-index,0);
       long res=(long)(a+b)*(a-b+1)/2;
       b=Math.max(a-((n-1)-index),0);
       res+=(long)(a+b)*(a-b+1)/2;
        return res-a;
       }
    }
        
        
        
        
        
