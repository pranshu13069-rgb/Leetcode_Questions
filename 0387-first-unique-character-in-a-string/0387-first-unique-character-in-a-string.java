class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
             boolean u = true;
            for(int j = 0; j < s.length(); j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                     u = false;
                     break;
                }
            }
            if(u){
               return i;
            }
        }
        return -1;
    }
}