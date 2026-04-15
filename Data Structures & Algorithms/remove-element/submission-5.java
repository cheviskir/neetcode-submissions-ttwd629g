class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int j:nums){
            if(j != val){
                nums[index] = j;
                index+=1;
            }
        }
        return index;
    }

    
}