class Solution {
    public List<String> commonChars(String[] words) {
       List<String> result = new ArrayList<>();
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words[0].length();i++){
            char ch = words[0].charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> helper = new HashMap<>();
            
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(map.containsKey(ch)){
                    
                    helper.put(ch , Math.min( map.get(ch) , helper.getOrDefault(ch,0)+1) );   // **
                }
            }
            
            map = helper;
        }
        
        for(char val : map.keySet()){
            int r = map.get(val);
            for(int i=0;i<r;i++){
                result.add(val + "");
            }
        }
        return result;
        
        
    }
}