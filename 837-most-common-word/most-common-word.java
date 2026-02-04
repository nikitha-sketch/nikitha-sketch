class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String arr[]=paragraph.split("\\s+");
        String res="";
        Map<String,Integer>map=new HashMap<>();
        Set<String>set=new HashSet<>();
        for(String b:banned){
            set.add(b);
        }
        for(String str:arr){
            if(!set.contains(str))
                map.put(str,map.getOrDefault(str,0)+1);
        }
        int max=0;
        for(String k:map.keySet()){
            if(map.get(k)>max){
                max=map.get(k);
                res=k;
            }
        }
        return res;
    }
}