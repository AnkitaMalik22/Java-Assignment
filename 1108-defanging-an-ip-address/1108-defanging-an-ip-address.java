class Solution {
    public String defangIPaddr(String address) {
          // String address="1.1.1.1";
        StringBuilder str=new StringBuilder();
         // String[] s = address.split(".");

        int i=0;
        while(i<address.length()){
            if(address.charAt(i) == '.'){
                  str.append("[.]");
            }
            else{
                
            str.append(address.charAt(i));
            }
          
            
            i++;
        }
        return str.toString();
    }
}