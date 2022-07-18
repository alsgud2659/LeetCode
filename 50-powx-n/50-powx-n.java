class Solution {
    public double myPow(double x, int n) {
        if(x == 0) {
            return 0;   
        } // x가 0이라면 0리턴
        
        if(n == 1) {
            return x;
        } // 1제곱이라면 x 리턴
        
        if(n == 0) {
            return 1;
        } // 모든 수의 0제곱은 1이므로 1리턴
        
        if(n < 0){
            return (1 / x) * myPow(1 / x, - (n + 1));
        } // n이 음수라면 지수법칙에 의해 1/x로
        
        if(n % 2 != 0){
            return x * myPow(x * x, n / 2); // n이 홀수라면 함수 실행 값 * x를 한다.
            // n/2를 했을 때 n이 홀수라면 나머지 1이 사라지기 때문에
        }else {
            return myPow(x * x, n / 2);
        } 
    }
}