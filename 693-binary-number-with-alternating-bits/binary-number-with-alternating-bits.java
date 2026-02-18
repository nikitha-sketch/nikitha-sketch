class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder str=new StringBuilder();
        while(n>0){
            str.append(n%2);
            n=n/2;
        }
        
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1))return false;
        }
        return true;
    }
}