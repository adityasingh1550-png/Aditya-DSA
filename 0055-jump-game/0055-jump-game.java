class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max_reach)
            return false;
            if((nums[i]+i)>max_reach)
            max_reach=nums[i]+i;
        }
        return true;

    }
}