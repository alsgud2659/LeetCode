class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count = 0;
        int temp = capacity;
        
        for(int i = 0; i < plants.length; i++){
            if(plants[i] <= capacity){
                count++;
                capacity = capacity - plants[i];
            }
            else{
                count += i;
                capacity = temp - plants[i];
                count += i + 1;
            }
        }
        return count;
    }
}