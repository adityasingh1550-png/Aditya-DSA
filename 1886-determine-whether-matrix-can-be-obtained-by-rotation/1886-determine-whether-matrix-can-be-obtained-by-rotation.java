class Solution {
    void rotate(int[][] mat1)
    {
        int n=mat1.length;
        //transpose
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=mat1[i][j];
                mat1[i][j]=mat1[j][i];
                mat1[j][i]=temp;
            }

        }
        //reverse
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=mat1[i][j];
                mat1[i][j]=mat1[i][n-1-j];
                mat1[i][n-j-1]=temp;
            }
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        
        for(int c=1;c<=4;c++){
           boolean result=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j])
                {
                    result=false;
                    break;
                }
            }
            if(result==false)
            break;
            
        }
        if(result==true)
        return true;
        rotate(mat);
        }
        return false;

    }
}