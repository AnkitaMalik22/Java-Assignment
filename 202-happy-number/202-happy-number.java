class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet(); // to check what elements we have seen till now
        while(n!=1){
            int current=n;//to store current number
            int sum=0; // to store sum
            while(current!=0){ // to calc square of digits total sum
                sum+= (current%10) * (current%10);
                current/=10; 
            }
            if(set.contains(sum)) return false; //if we have seen sum earlier we are never getting 1
            set.add(sum); // if not seen then add to set
            n=sum; // update n to current sum
        }
        return true; // we successfuly came out of loop so happy no 
    }
}