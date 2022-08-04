class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        combination(0,nums,visited, ans, new ArrayList<>());
        return ans;
    }
    
    void combination(int ind,int[] arr,boolean[] visited,List<List<Integer>> ans, ArrayList<Integer> ds){
        if(ds.size()==arr.length){
            if(ans.contains(ds)) return;
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i] || (i!=0 && arr[i]==arr[i-1] && !visited[i-1])) continue;
            ds.add(arr[i]);
            visited[i]=true;
            combination(i+1,arr,visited,ans,ds);
            ds.remove(ds.size()-1);
            visited[i]=false;
        }
        return;
    }
}