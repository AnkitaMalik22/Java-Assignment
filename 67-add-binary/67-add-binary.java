class Solution {
    public String addBinary(String a, String b) {
         int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0) {
            int aa = 0,bb=0;
            if(i>=0) aa = a.charAt(i--)-'0';
            if(j>=0) bb = b.charAt(j--)-'0';
            int sum = aa^bb^carry;
            carry = carry&aa|carry&bb|aa&bb;
            sb.insert(0,sum);
        }
        if(carry==1) sb.insert(0,carry);
        return sb.toString();
    }
}