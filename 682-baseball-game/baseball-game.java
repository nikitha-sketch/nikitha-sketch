class Solution {
    public int calPoints(String[] operations) {
       /* Stack<Integer>st=new Stack<>();
        for(String str:operations){
            if(str.equals("+")){
                int last=st.pop();
                int newScore=last+st.peek();
                st.push(last);
                st.push(newScore);
            }
            else if(str.equals("D")){
                st.push(2*st.peek());
            }
            else if(str.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int num:st){
            sum+=num;
        }
        return sum;*/
        List<Integer>list=new ArrayList<>();
        for(String s:operations){
            int n=list.size();
            if(s.equals("+")){
                list.add(list.get(n-1)+list.get(n-2));
            }
            else if(s.equals("C")){
                list.remove(n-1);
            }
            else if(s.equals("D")){
                list.add(list.get(n-1)*2);
            }
            else{
                list.add(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int ans:list){
            sum+=ans;
        }
        return sum;
    }
}