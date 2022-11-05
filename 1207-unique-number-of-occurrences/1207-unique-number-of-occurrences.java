class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==1) return true;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        //pusing values to hash map ,if duplicates increment their values
        for(Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //creating a hash set to check if there is repeated occurences or not
        HashSet<Integer> set=new HashSet<>(map.values());
        return map.size()==set.size();
    }
}