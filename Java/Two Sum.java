class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int [] list=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int key=target-nums[i];
            if(map.containsKey(key))
            {
                int j=map.get(key);
                list[0]=i;
                list[1]=j;
                break;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return list; 
    }
}
