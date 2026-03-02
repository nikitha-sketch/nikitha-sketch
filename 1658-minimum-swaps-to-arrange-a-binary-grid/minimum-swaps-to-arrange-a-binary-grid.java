class Solution {
    public int minSwaps(int[][] grid) {
        int n=grid.length;
        int zeroes[]=new int[n];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0){
                    cnt++;
                }
                else break;
            }
            zeroes[i]=cnt;
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            int needed=n-1-i;
            int j=i;
            while(j<n && zeroes[j]<needed){
                j++;
            }
            if(j==n)return -1;
            while(j>i){
                int temp=zeroes[j];
                zeroes[j]=zeroes[j-1];
                zeroes[j-1]=temp;
                swaps++;
                j--;
            }
        }
        return swaps; 
    }
}