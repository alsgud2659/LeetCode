class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkcnt = numBottles;
        while(numBottles/numExchange >= 1){
            drinkcnt += numBottles/numExchange; 
            numBottles = numBottles/numExchange + (numBottles % numExchange);
        }
        
        return drinkcnt;
    }    
}