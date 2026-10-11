class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rMinMax = Integer.MIN_VALUE;
        int cMaxMin = Integer.MAX_VALUE;
        for(int row=0;row<m;row++)
        {
            int rMin=matrix[row][0];
            for(int col=0;col<n;col++)
            {
                if(matrix[row][col]<rMin)
                rMin=matrix[row][col];
            }
            if(rMin>rMinMax)
            rMinMax=rMin;
        }
        
        for(int col=0;col<n;col++)
        {
            int cMax=matrix[0][col];
            for(int row=0;row<m;row++)
            {
                if(matrix[row][col]>cMax)
                cMax=matrix[row][col];
            }
            if(cMax<cMaxMin)
            cMaxMin=cMax;
        }
        if(cMaxMin==rMinMax)
         ans.add(cMaxMin);
        return ans ;
        
    }
}