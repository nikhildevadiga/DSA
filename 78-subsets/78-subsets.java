class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,nums,ans,new ArrayList<>());
        return ans;
    }
    void combination(int i,int[] arr,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(i==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(arr[i]);
        combination(i+1,arr,ans,ds);
        ds.remove(ds.size()-1);
        combination(i+1,arr,ans,ds);
        return;
    }
}