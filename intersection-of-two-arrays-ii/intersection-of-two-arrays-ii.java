class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0; 
        int j=0;

        ArrayList<Integer> arr = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
           if(nums1[i]>nums2[j]){
              
               j++;
           }
        else if(nums1[i]<nums2[j]){
            i++;
            }
           else {
               arr.add(nums1[i]);
               i++;
               j++;
               
               }
        }
           
                       
        int[] array=new int[arr.size()];
       int c=0;
         for(int k : arr){
           array[c++]=k;
             }
      
        
           return array;
        
    

    }
}