class Solution {                          
    public int climbStairs(int n) {
        if(n < 4) {
            return n;    
        }                     
        int n1=2;
        int n2=3;
        int n3=0;
        for(int i = 4; i <= n; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}