class Solution {
    public String reverseOnlyLetters(String s) {
        Map<Integer, String> chars = new HashMap<>();
    StringBuilder res = new StringBuilder();
    int size = s.length();

    for (int i = 0; i < size; i++){
        if (Character.isLetter(s.charAt(i))){
            res.append(s.charAt(i));
            continue;
        }
        chars.put(i, s.charAt(i)+"");
    }
    res.reverse();

    for (int i = 0; i < size; i++){
        if (chars.get(i) != null){
            res.insert(i, chars.get(i));
        }
    }

    return res.toString();
} 
    
}