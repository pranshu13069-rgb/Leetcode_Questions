class Solution {
    public int fib(int n) {
        if( n == 2){
            return 1;
        }else if(n == 1 ){
            return 1;
        }else{
        int a = 0 , b = 1;
        int check = 0;
        for(int i = 0 ; i < n-1; i++){
           int next = a + b;
              check = next;
            a = b;
            b = next;
        }
        return check;
    }
        
    }
}