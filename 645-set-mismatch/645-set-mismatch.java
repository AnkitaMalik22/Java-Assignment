class Solution {
    public int[] findErrorNums(int[] arr) {
       
        int i=0;
        int n= arr.length;
        ArrayList<Integer> list= new ArrayList<Integer>();
        
        while(i<n){
            
       
            
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
                }
            
        else{
            i++;
            }
        }
        for(int j=0; j<arr.length;j++){
        if(arr[j] != j+1){
            list.add(arr[j]);
            list.add(j+1);
           }
            }
            int [] nums= new int[list.size()];
            int c=0;
                for(int k:list){
                    nums[c++]=k;
                    }
            
        
        
        return nums;
        
    }
}