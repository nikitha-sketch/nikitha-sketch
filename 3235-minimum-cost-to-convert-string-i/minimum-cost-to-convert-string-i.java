class Solution {
    static final long INF = Long.MAX_VALUE / 4;
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int n=26;
        long graph[][]=new long[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(graph[i],INF);
            graph[i][i]=0;
        }

        for(int i=0;i<original.length;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            graph[u][v]=Math.min(graph[u][v],cost[i]);
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(graph[i][k]+graph[k][j]<graph[i][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                    }
                }
            }
        }

        long total=0;
        for(int i=0;i<source.length();i++){
            if(source.charAt(i)==target.charAt(i)){
                continue;
            }
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            if(graph[u][v]==INF){
                return -1;
            }
            total+=graph[u][v];
        }
        return total;
    }
}