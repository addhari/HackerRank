package hackerrank;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class bfs
{
    
    
    public static void main(String[] args)
    {
        bfs d=new bfs(4);
        d.addVertex(0,1);
        d.addVertex(0,2);
        d.addVertex(1,2);
        d.addVertex(2,0);
        d.addVertex(2,3);
        d.addVertex(3,3);
        d.traverse(2);
        
    }
    int size=0;
    
    LinkedList< Integer> adj[]=null;
    boolean[] visited=null;
    
    bfs(int size)
    {
        this.size=size;
        adj=new LinkedList[size];
        visited=new boolean[size];
        for(int i=0;i<size;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
        
    }
    void addVertex(int vertex,int edge)
    {
        adj[vertex].add(edge);
        
    }
    
    void traverse(int index)
    {
        
        
        visited[index]=true;
        System.out.print(index+"  ");
        
        Iterator<Integer> i=adj[index].listIterator();
        while(i.hasNext())
        {
            int in=i.next();
            if(!visited[in])
            {
                visited[in]=true;
                traverse(in);
            }
            
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
}