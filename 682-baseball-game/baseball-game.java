class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
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
        return sum;
    }
}