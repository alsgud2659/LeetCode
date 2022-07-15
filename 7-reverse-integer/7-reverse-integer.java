class Solution {
    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        
        if(-Integer.MAX_VALUE <= result && result <= Integer.MAX_VALUE) {
            return (int)result;                                
        } else {		//정수형의 범위내에 들어온다면 int형으로 형변환
            return 0;
        }
    }
}