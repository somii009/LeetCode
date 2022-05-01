class Solution {
    public int minMoves(int[] nums) {
        int minimum = nums[0];
        int sum = 0;
        
        for(int num : nums){
            sum += num;
            minimum = (minimum <= num) ? minimum : num;
        }
        
        return sum - minimum * (nums.length);
    }
}