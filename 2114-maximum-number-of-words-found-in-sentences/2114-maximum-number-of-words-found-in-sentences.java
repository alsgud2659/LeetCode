class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for(int i = 0; i < sentences.length; i++) {
            int temp = sentences[i].trim().split("\\s+").length;
            if(result < temp) {
                result = temp;
            }
        }
        return result;
    }
}