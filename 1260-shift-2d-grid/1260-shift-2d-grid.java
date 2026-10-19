class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int n=row*col;
        k=k%n;
        reverse(grid,0,n-1,col);
        reverse(grid,0,k-1,col);
        reverse(grid,k,n-1,col);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<col;j++)
            {
                list.add(grid[i][j]);
            }
            result.add(list);
        }
        return result;
    }
     void reverse(int[][] grid, int start, int end, int col) {
        while (start < end) {
            int r1 = start / col;
            int c1 = start % col;

            int r2 = end / col;
            int c2 = end % col;

            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;

            start++;
            end--;
        }
    }
}
    

