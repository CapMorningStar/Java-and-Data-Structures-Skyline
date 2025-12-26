import java.util.LinkedList;
import java.util.Queue;
public class BreadthFirstSearch
{
    private LinkedList<Integer>[] adj;
    private int V;//number of Vertices
    private int E;//number of Edges

    public BreadthFirstSearch(int nodes)
    {
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];
        
        for (int v=0; v<V;v++)
        {
            adj[v]=new LinkedList<>();
        }
    }

    public void addEdge(int u,int v)
    {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices, "+E+" edges "+"\n");
        for(int v=0;v<V;v++)
        {
            sb.append(v+": ");
            for(int w: adj[v])
            {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s)
    {
        boolean[] visited =new boolean[V];

        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty())
        {
            int u=q.poll();
            System.out.print(u+" ");
            for(int v:adj[u])
            {
                if(!visited[v])
                {
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
        
    }

    public static void main(String[] args) 
    {
        BreadthFirstSearch g=new BreadthFirstSearch(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(4, 2);
        
        System.out.println(g);

        System.out.println("Breadth First Search: ");
        g.bfs(0);
    }
}