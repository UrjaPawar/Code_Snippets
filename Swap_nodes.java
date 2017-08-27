package coders2;

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class Swap_nodes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Node> que=new LinkedList<Node>();
        Node root=new Node(1);
        Node temp=root;
        que.add(temp);
        while(n!=0){
            int x=sc.nextInt();
            Node xx=new Node(x);
            int y=sc.nextInt();
            Node yy=new Node(y);
            temp=que.remove();
            if(xx.data!=-1){
            temp.left=xx;
            que.add(xx);
            }    
            if(yy.data!=-1){
            temp.right=yy;
            que.add(yy);  
            }   
            n--;
        }
        int t=sc.nextInt();
        while(t!=0){            
            int k=sc.nextInt();
            int level=find_level(root);
            int i=1;
            // for k,2k,3k...
            while(k*i<=level){
            temp=root;
            ArrayList<Node> roots=new ArrayList<>();
            k=k*i;
            i++;
            Queue<Node> sw=new LinkedList<Node>();
            int d=1;
            sw.add(temp);
            Node s=new Node(0);
            if(k==1){roots.add(temp);}
            while(d!=k && d<=level){
                for(int j=0;j<roots.size();j++){
                    sw.add(roots.get(j));
                }
                roots.clear();
                while(sw.isEmpty()==false){  
                s=sw.remove();  
                if(s.left!=null){roots.add(s.left);}
                if(s.right!=null){roots.add(s.right);}}
                d++;
            }
            //swap
            for(int z=0;z<roots.size();z++){
                    temp=roots.get(z);
                    Node v=temp.left;
                    temp.left=temp.right;
                    temp.right=v;
                }
            }
         
        //inorder   
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        while (stack.size() > 0) {
            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                node = node.right;
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
           System.out.println();  
           t--; 
        }
       
        
    }
    public static int find_level(Node root){
        if (root==null) {
        return 0;
    }
    else {
        return Math.max(find_level(root.left), find_level(root.right)) + 1;
    }
    }
}
