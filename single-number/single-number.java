class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums)
        // create a hashmap
    HashMap<Integer, Integer> elements = new HashMap<>();
for(int i : nums){
        if(elements.containsKey(i)){
            elements.put(i,elements.get(i)+1);
        }else{
            elements.put(i,1);
        }
        
    }
        for(int k: nums){
        if(elements.get(k)==1){
           return k; 
        }}
        return nums[0];
    }
}