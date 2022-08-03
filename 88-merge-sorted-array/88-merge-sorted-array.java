class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int full=m+n;
        int num1=m-1,num2=n-1;
        while(num1>=0 && num2>=0){
            if(nums1[num1]>nums2[num2]){
                nums1[--full]=nums1[num1];
                num1--;
            }
            else{
                nums1[--full]=nums2[num2];
                num2--;
            }
        }
        while(num2>=0){
            nums1[--full]=nums2[num2--];
        }
    }
}