/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
       /* List<Integer>list=new ArrayList<>();
        preorderHelper(root,list);
        return list;
    }
    public void preorderHelper(Node root,List<Integer>list){
        if(root==null)return ;
        list.add(root.val);
        if(root.children!=null){
            for(Node child:root.children){
                preorderHelper(child,list);
            }
        }
    }*/
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node index=st.pop();
            list.add(index.val);
            for(int i=index.children.size()-1;i>=0;i--){
                st.push(index.children.get(i));
            }
        }
        return list;
    }
}