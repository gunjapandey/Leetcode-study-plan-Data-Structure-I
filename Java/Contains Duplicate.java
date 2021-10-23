class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        boolean flag=false;
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int key=nums[i];
            if(map.containsKey(key))
            {
                int val=map.get(key);
                map.put(key,val+1);
            }
            else
            {
                map.put(key,1);
            }
        }
        Iterator <Integer> it = map.keySet().iterator();
        while(it.hasNext())
        {
            int key=(int)it.next(); 
            if(map.get(key)>=2)
            {
                flag=true;
            }
        }
        return flag;
    }
}
