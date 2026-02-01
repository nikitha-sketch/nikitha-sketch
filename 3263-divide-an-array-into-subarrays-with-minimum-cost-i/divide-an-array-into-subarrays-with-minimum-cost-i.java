class Solution {
    public int minimumCost(int[] nums) {
        /*int n=nums.length;
        int first=nums[0];
        Arrays.sort(nums,1,n);
        return first+nums[1]+nums[2];*/

        int firstNum=nums[0];
        int firstMin=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<firstMin){
                secondMin=firstMin;
                firstMin=nums[i];
            }
            else if(nums[i]<secondMin){
                secondMin=nums[i];
            }
        }
        return firstNum+firstMin+secondMin;
    }
}