
import java.util.*;


public class DFS {
    

   
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s, int d){
          this.src = s;
          this.dest = d;
          
        }
    }
    public static void createGraph(ArrayList<Edge>graph[])
    {
         for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
         }

         graph[0].add(new Edge(0, 2));
        
         graph[1].add(new Edge(1,2));
         graph[1].add(new Edge(1,3));
         graph[1].add(new Edge(1,5));

         graph[2].add(new Edge (5,3));
         graph[2].add(new Edge (6,5));

         graph[3].add(new Edge(7,8));
         graph[3].add(new Edge (4,6));

         graph[4].add(new Edge(1,4));
         graph[4].add(new Edge(6,3));

         
        
         

    }
      public static void dfs(ArrayList<Edge>graph[], int curr, boolean vis[]){
        System.out.println(curr + " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size();i++){
            Edge  e = graph[curr].get(i);
            if(vis[e.dest]== false){
                dfs(graph,e.dest,vis);
            }
            
        }

      }
    public static void main(String args[]){
           int v=6;
           ArrayList<Edge>graph[] = new ArrayList[v];
           createGraph(graph);
           boolean vis[] = new boolean[v];
         for(int i=0; i<v; i++){
            if(vis[i] == false){
                dfs(graph,i,vis);
            }
         } 
           System.out.println();
        


          
    }

   
}

