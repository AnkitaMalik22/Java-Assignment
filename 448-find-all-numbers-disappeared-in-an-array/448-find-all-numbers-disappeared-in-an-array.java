class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        int n=arr.length;
        ArrayList<Integer> nums= new ArrayList<Integer>();
        while(i<n){
            int current=arr[i]-1;
            if(arr[i] !=arr[current]){
               swap(arr,i, current);
               }
            else{
                i++;
                }
            }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!= j+1){
                nums.add(j+1);
                }
            }
        return nums;
            
    }
    public void swap(int[] arr,int f,int s){
        int t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
        }
}