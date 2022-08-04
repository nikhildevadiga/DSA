class Solution {
    public int totalNQueens(int n) {
        int ans=0;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        ans=solve(0,board,n,ans);
        return ans;
    }
    
    public int solve(int col,char[][] board,int n, int ans){
        if(col==n){
            ans=ans+1;
            return ans;
        }
        int x=0;
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                x+=solve(col+1,board,n,ans);
                board[row][col]='.';
            }
        }
        return x;
        
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

}
        
