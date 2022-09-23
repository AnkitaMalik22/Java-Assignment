class Solution {
    public int balancedStringSplit(String s) {
         int state = 0, count = 0;
        
        for(char c: s.toCharArray()){
            state += c == 'R' ? 1 : -1;
            
            if(state == 0) count++;
        }
        return count;
    }
}