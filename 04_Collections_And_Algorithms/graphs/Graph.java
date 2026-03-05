import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



class Graph {

    static int V;
    int[][] adjMat;
    List<List<Integer>> adjList = new ArrayList<>();


    Graph(int v) {
        V = v;
        adjMat = new int[V][V];
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }


    void addEdge(int source, int dest) {
        adjMat[source][dest] = 1;
        // for undirected graphs : adjMat[dest][source] = 1

        adjList.get(source).add(dest);

    }


    void printAdjMat() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adjMat[i][j] == 1) {
                    System.out.print(adjMat[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    void printAdjList() {
        for (int i = 0; i < V; i++) {
            System.out.println(i + " -> " + adjList.get(i));
        }
    }

    void bfs(int start) {
        // bfs = 0, 1, 4, 2, 3
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr+" ");
            for(int i:adjList.get(curr)) {
                if(!visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }


    void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        stack.push(start);
        visited[start] = true;

        while(!stack.isEmpty()) {
            int curr = stack.pop();
            System.out.print(curr+ " ");
            for(int i:adjList.get(curr)) {
                if(!visited[i]){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        } 
    }


    public static void main(String[] args) {
    
        Graph obj = new Graph(5);
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(0, 4);
        obj.addEdge(4, 1);

        System.out.println("Adjacency Matrix : ");
        obj.printAdjMat();
        System.out.println();

        System.out.println("Adjacency List : ");
        obj.printAdjList();
        System.out.println();

        System.out.println("DFS Traversal : ");
        obj.dfs(0);
        System.out.println();

        System.out.println("BFS Traversal : ");
        obj.bfs(0);
        System.out.println();

    }   
}
