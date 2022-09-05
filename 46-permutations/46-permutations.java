class Solution {
   public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findPermute(nums, new ArrayList<Integer>(), list, new boolean[nums.length]);
        System.out.println(list.size());
        return list;
    }
	
	public void findPermute(int[] nums, List<Integer> ans, List<List<Integer>> list, boolean[] used) {
		if(ans.size() == nums.length) {
			list.add(new ArrayList<Integer>(ans));
			return;
		}
		for(int i=0; i<nums.length; i++) {
			if(!used[i]) {
				used[i] = true;
				ans.add(nums[i]);
				findPermute(nums, ans, list, used);
				used[i] = false;
				ans.remove(ans.size()-1);
			}
			
		}
	}
}