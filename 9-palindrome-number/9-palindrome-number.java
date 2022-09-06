class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
    int a =x ,sum=0;
        
       while(a>=10){
           sum *=10;
           sum+=a%10;
           a/=10;
           }
        return sum==x/10 && a==x%10;
        
    }
}