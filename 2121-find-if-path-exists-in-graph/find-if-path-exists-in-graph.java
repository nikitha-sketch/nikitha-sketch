class Solution {
    public static void dfs(int node,List<Integer>[]adj,boolean vis[]){
        vis[node]=true;
        for(int nei:adj[node]){
            if(!vis[nei]){
                dfs(nei,adj,vis);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        List<Integer>[]adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int e[]:edges){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        boolean vis[]=new boolean[n];
        dfs(source,adj,vis);
        return (vis[destination])?true:false;
    }
}