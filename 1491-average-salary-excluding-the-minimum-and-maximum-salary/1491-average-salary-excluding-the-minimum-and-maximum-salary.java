class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        if(salary.length==3) return salary[1];
        double sum=0;
        for(int i=1;i<=salary.length-2;i++){
            sum+=salary[i];
        }
        return sum/(salary.length-2);
    }
}