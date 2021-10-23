class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
    int size=nums.length;
    for (int i = 0; i < size; i++)
    {
        max_ending_here = max_ending_here + nums[i];
        if (max_so_far < max_ending_here)
            max_so_far = max_ending_here;
 
        if (max_ending_here < 0)
            max_ending_here = 0;
    }
    return max_so_far;
    }
}
