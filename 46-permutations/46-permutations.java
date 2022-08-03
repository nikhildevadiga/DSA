class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,nums, ans, new ArrayList<>());
        return ans;
    }
    
    void combination(int ind,int[] arr,List<List<Integer>> ans, ArrayList<Integer> ds){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(ds.contains(arr[i])) continue;
            ds.add(arr[i]);
            combination(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        return;
    }
}