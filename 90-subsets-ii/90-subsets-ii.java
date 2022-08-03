class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void combination(int i,int[] nums,List<List<Integer>> ans, ArrayList<Integer> ds){
        
        ans.add(new ArrayList<>(ds));
         
        for(int x=i;x<nums.length;x++){
        if(x>i && nums[x]==nums[x-1]) continue;
        
        ds.add(nums[x]);
        combination(x+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        //combination(x+1,nums,ans,ds);
        }
        return;
    }
    
    
}