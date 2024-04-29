package Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    static class Edge{
        int srcnode;
        int dstnode;
        int weight;
        public Edge (int s, int d, int w) {
            this.srcnode = s;
            this.dstnode = d;
            this.weight = w;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);

        //print 2's neighburs;
        for (int i = 0; i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.dstnode+" , "+e.weight+" ");
        }
    }
}



