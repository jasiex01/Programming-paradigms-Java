import py4j.GatewayServer;

public class GraphEntryPoint {
    private Graph graph;

    public GraphEntryPoint(){
        graph = new Graph();
    }

    public Graph getGraph() {
        return graph;
    }

    public Node newNode(int val, String name) {
        return new Node(val, name);
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new GraphEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }
}
