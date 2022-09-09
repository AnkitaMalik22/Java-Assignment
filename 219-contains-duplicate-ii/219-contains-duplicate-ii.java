class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
int i;
for(i=0;i<nums.length;i++){
if(map.containsKey(nums[i])){
int value=map.get(nums[i]);
if(Math.abs(i-value)<=k)
return true;
else
map.put(nums[i],i);
}
else
map.put(nums[i],i);
}
return false;
}
}