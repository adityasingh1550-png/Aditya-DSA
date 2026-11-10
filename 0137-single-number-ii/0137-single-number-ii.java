class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int idx=0;idx<32;idx++)
        {
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if((nums[i]&1<<idx)!=0)
                count++;
            }
            if(count%3==1)
            ans=ans|(1<<idx);
        }
        return ans; 
    }
}