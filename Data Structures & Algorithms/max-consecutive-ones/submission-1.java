class Solution {
    int counter = 1;
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int MaxCounter = 0;
        for(int i : nums){
            if(i == 1){
                counter += 1;
                if(counter > MaxCounter) {
                    MaxCounter = counter;
                }
            }else{
               counter = 0; 
            }
        }
        return MaxCounter;
    }
}