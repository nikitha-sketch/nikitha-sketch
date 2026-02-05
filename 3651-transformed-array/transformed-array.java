class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int index=(i+nums[i])%n;
                res[i]=nums[index];
            }
            else if(nums[i]<0){
                int index=(i+nums[i])%n;
                if(index<0)index+=n;
                res[i]=nums[index];
            }
            else{
                res[i]=nums[i];
            }
        }
        return res;
    }
}