class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++){
                temp += accounts[i][j];
            }
            if (temp > result) {
                    result = temp;
                    temp = 0;
            }else {
                temp = 0;
            }
        }
        
        return result;
    }
}