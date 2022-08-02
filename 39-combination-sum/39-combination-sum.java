class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combinationPrint(candidates, 0, target,ans,new ArrayList<Integer>());
        return ans;
    }
    public static void combinationPrint(int[] arr, int index, 
                                        int target, List<List<Integer>> ans,ArrayList<Integer> ds)
    {

        if (index == arr.length)
        {
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
        return;
        }
            if(arr[index]<=target){
            ds.add(arr[index]);
            combinationPrint(arr,index,target-arr[index],ans,ds);
            ds.remove(ds.size() - 1);
        }
            combinationPrint(arr, index + 1,target,ans,ds);

        return;
    }
}