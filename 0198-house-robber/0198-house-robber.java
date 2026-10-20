class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        int[] t=new int[n+1];
        t[0]=0;
        t[1]=nums[0];
        for(int i=2;i<=n;i++)
        {
            int steal=nums[i-1]+t[i-2];
            int skip=t[i-1];
            if(steal>skip)
            t[i]=steal;
            else
            t[i]=skip;
        }
        return t[n];
    }
}