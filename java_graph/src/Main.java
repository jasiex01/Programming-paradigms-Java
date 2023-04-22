
public class Main{
    public static void main (String[] args) {

        Graph graph = new Graph();
        //GatewayServer server = new GatewayServer(graph);
        //server.start();
        //nodes
        Node v0 = new Node(0, "0");
        Node v1 = new Node(1, "1");
        Node v2 = new Node(2, "2");
        Node v3 = new Node(3, "3");
        Node v4 = new Node(4, "4");

        graph.addNode(v0);
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);

        //edges
        graph.addEdge(v0, v1, 2);
        graph.addEdge(v1, v2, 3);
        graph.addEdge(v1, v3, 3);
        graph.addEdge(v2, v0, 1);
        graph.addEdge(v2, v4, 1);
        graph.addEdge(v3, v4, 4);

        //graph.BFS(v0);
        graph.dfs(v0);

    }
}

