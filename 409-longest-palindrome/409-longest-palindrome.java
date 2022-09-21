class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res=0;
        
        for(int i=0 ; i<s.length() ; i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
                for(int val: map.values()) {
            res += val%2==1 ? val-1 : val;
        }
        
        return s.length() > res ? res + 1 : res;
        }
        
    
}