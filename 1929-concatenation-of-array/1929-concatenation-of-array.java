class Solution {
    public int[] getConcatenation(int[] nums) {
        int idx = 0;
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        
        for(int i = nums.length; i < result.length; i++) {
            result[i] = nums[idx];
            idx++;
        }
        
        return result;
    }
}