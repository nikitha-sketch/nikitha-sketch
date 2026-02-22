class Solution {
    public int binaryGap(int n) {
       /* StringBuilder str=new StringBuilder();
        while(n>0){
            str.append(n%2);
            n=n/2;
        }
        int maxGap=0;
        int lastIndex=-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                if(lastIndex!=-1){
                    maxGap=Math.max(maxGap,i-lastIndex);
                }
                lastIndex=i;
            }
        }
        return maxGap;*/
        int maxGap=0;
        int lastIndex=-1;
        int index=0;
        while(n>0){
            if((n&1)==1){
                if(lastIndex!=-1){
                    maxGap=Math.max(maxGap,index-lastIndex);
                }
                lastIndex=index;
            }
            n>>=1;
            index++;
        }
        return maxGap;
    }
}