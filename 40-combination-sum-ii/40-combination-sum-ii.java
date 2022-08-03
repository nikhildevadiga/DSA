class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        findCombi(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void findCombi(int ind,int[] arr,int t,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(t==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            
            if(arr[i]>t) break;
            
            ds.add(arr[i]);
            findCombi(i+1,arr,t-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        return;
    }
}