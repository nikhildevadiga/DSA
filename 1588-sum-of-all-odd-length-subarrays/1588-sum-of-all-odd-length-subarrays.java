class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            int s=arr[i];
            sum=sum+s;
            for(int j=i+1;j<n;j++){
            s=s+arr[j];
                
                if((j-i+1)%2!=0){
                sum=sum+s;
                
            }  
            }
            
        }
        return sum;
        
    }
  
}