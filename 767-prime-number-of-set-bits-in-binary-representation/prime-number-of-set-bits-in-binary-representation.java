class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        for(int i=left;i<=right;i++){
            int cnt=countSetBits(i);
            if(isPrime(cnt)){
                result++;
            }
        } 
        return result;
    }
    public int countSetBits(int num){
        int cnt=0;
        while(num>0){
            cnt+=num%2;
            num=num/2;
        }
        return cnt;
    }
    public boolean isPrime(int num){
        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}