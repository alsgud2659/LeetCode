class Solution {
    public int change(int amount, int[] coins) {
        int[] memo = new int[amount + 1];
        memo[0] = 1;
        
        // j원이 되기위해 추가되는 동전의 수를 나타내는 점화식
        // memo[i] = memo[i] + memo[i - coins]
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j < memo.length; j++){
                memo[j] += memo[j - coins[i]];
            }
        }
        
        return memo[amount];
    }
}