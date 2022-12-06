class Solution {
    private static int MAX_VALUES = 1000000;
    public int[][] updateMatrix(int[][] mat) {
      int m = mat.length;
      int n = mat[0].length;    
      int dist[][] = new int[m][n];
      for(int i = 0; i < m; i++) Arrays.fill(dist[i],MAX_VALUES);
      
      for(int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
              if(mat[i][j]==0){ 
                  dist[i][j] = 0;
                  continue;     
              }               
              if(i > 0) dist[i][j]  = Math.min(dist[i][j], dist[i - 1][j] + 1);
              if(j > 0) dist[i][j]  = Math.min(dist[i][j], dist[i][j - 1] + 1);
          }
      }
      for(int i = m -1; i >= 0; i--){
         for(int j = n -1; j >= 0; j--){
                if(i != m - 1) dist[i][j]  = Math.min(dist[i][j], dist[i + 1][j] + 1);
                if(j != n - 1) dist[i][j]  = Math.min(dist[i][j], dist[i][j + 1] + 1);
         }
      } 
      return dist;
    }
}


/*Runtime: 7 ms, faster than 97.04% of Java online submissions for 01 Matrix.
Memory Usage: 46 MB, less than 88.99% of Java online submissions for 01 Matrix.*/