class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int north[] = new int[n];
        int west[] = new int[n];
        
        for(int i = 0; i < n; i++){
            int max = grid[0][i];
            for(int j = 1; j < n; j++){
                max = Math.max(max , grid[j][i]);
            }
            
            north[i] = max;
        }
        
        for(int i = 0; i < n; i++){
            int max = grid[i][0];
            for(int j = 1; j < n; j++){
                max = Math.max(max , grid[i][j]);
            }
            
            west[i] = max;
        }
        
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans += Math.min(north[j] , west[i]) - grid[i][j];
            }
        }
        
        return ans;
        
    }
}