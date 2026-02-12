class Solution {
    public int longestBalanced(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int size=s.length(),ans=0;
        for(int i=0;i<size;i++){
            map.clear();
            for(int j=i;j<size;j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                int cnt=map.get(ch);
                boolean flag=true;
                for(int count:map.values()){
                    if(count!=cnt){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}