class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat[0].length*mat.length)
        return mat;
        int count=0;
        int[][] result=new int[r][c];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                result[count/c][count%c]=mat[i][j];
                count++;
            }
        }
        return result;
        
    }
}