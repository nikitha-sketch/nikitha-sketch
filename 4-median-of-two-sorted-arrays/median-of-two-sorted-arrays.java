
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int n=nums1.length;
        int m=nums2.length;
        List<Integer>arr=new ArrayList<>();
        for(int num:nums1)arr.add(num);
        for(int num:nums2)arr.add(num);
        Collections.sort(arr);
        int size=arr.size();
        if(size%2==1){
            return arr.get(size/2); 
        }
        else{
            return (arr.get(size/2-1)+arr.get(size/2))/2.0;
        }*/
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n=nums1.length;
        int m=nums2.length;
        int left=0,right=n;
        while(left<=right){
            int part1=(left+right)/2;
            int part2=(n+m+1)/2-part1;
            int left1=(part1==0)?Integer.MIN_VALUE:nums1[part1-1];
            int left2=(part2==0)?Integer.MIN_VALUE:nums2[part2-1];
            int right1=(part1==n)?Integer.MAX_VALUE:nums1[part1];
            int right2=(part2==m)?Integer.MAX_VALUE:nums2[part2];
            if(left1<=right2 && left2<=right1){
                if((n+m)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
                else{
                    return (double)Math.max(left1,left2);
                }
            }
            else if(left1>right2){
                right=part1-1;
            }
            else{
                left=part1+1;
            }
        }
        return 0.0;
    }
}