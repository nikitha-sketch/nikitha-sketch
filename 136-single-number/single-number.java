class Solution {
    public int singleNumber(int[] nums) {
        /*int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;*/
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;

        /*int n=nums.length;
        int num=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt=0;
            num=nums[i];
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
            if(cnt==1)return num;
        }
        return num;*/
    }
}