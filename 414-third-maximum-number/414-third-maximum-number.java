class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list =new ArrayList<>();
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                         count++;
                         if(count==3){
                             return nums[i];}
                         }
            }
        
             return list.get(0);       
    }
}