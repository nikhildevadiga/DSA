class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        solve(0,board,n,ans);
        return ans;
    }
    
    public void solve(int col,char[][] board,int n, List<List<String>> ans){
        if(col==n){
            ans.add(construct(board,n));
            return;
        }
        
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                solve(col+1,board,n,ans);
                board[row][col]='.';
            }
        }
        
    }
    
    public boolean isSafe(int row,int col,char[][] board,int n){
        int r=row, c=col;
        while(col>=0){
            if(board[row][col]=='Q')
                return false;
            col--;
        }
        
        row=r; col=c;
        while(col>=0 && row>=0){
            if(board[row][col]=='Q')
                return false;
            col--; row--;
        }
        
        row=r; col=c;
        while(col>=0 && row<n){
            if(board[row][col]=='Q')
                return false;
            col--; row++;
        }
        
        return true;
    }
    
    public List<String> construct(char[][] board,int n){
        List<String> res=new ArrayList();
        for(int i=0;i<n;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
}