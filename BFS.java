import java.util.*;
public class BFS{
   
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
            graph[i] = new ArrayList<>();
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
    public static void bfs(ArrayList<Edge> graph[], int v){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[]=new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
           int curr = q.remove();
           if(!visit[curr]){
             System.out.print(curr+ " ");
             visit[curr] = true;

             for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                q.add(e.dest);
             }
           }
        }
       System.out.println();
    }
    public static void main(String args[]){
           int v=5;
           ArrayList<Edge>graph[] = new ArrayList[v];
           createGraph(graph);
           bfs(graph,v);
        


          
    }

   
}
