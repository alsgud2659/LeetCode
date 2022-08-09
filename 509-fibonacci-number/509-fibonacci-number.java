class Solution {
    public int fib(int n) {
        // n이 0 이거나 1일때의 처리
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        // 메모이제이션
        for(int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        
        return dp[n];
    }
}
