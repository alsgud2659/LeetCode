class Solution {
    public int maxArea(int[] height) {
        // 배열의 첫인덱스와 끝인덱스를 저장
        int start = 0;
        int end = height.length-1;    
        int maxArea = 0;
        
        // 끝인덱스가 첫 인덱스보다 클때까지만 반복 진행
        while(start < end){
            // 첫값보다 끝값이 크다면 기존에 maxArea와 새로 측정된 넓이를 비교해 더 큰값을 maxArea로 갱신후
            // start값을 하나 증가시킴
            if(height[start] < height[end]) {
                maxArea = Math.max(maxArea, height[start] * (end-start));
                start++;
            }
            // 반대라면 end값을 하나 감소시킴
            else{
                maxArea = Math.max(maxArea, height[end] * (end-start));
                end--;
            }
        }
        return maxArea;
    }
    
}