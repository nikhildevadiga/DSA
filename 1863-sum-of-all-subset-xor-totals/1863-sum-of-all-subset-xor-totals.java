class Solution {
    public int subsetXORSum(int[] nums) {
        return combination(nums,0,0);
    }
    public int combination(int[] arr,int i,int sum){
        if(i==arr.length) return sum;
        
        int takeCurrent = combination(arr,i+1,sum^arr[i]);
        
        int dontTakeCurrent = combination(arr,i+1,sum);
        
        return takeCurrent+dontTakeCurrent;
    }
}