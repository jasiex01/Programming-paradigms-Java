import java.util.LinkedList;

class Graph {
    private LinkedList<Node> nodes;

    public Graph() {
        nodes = new LinkedList<>();
    }

    public boolean addEdge(Node n1, Node n2, int weight) {
        return n1.getEdges().add(new Edge(n2, weight));
    }

    public boolean addEdge(Node n1, Node n2) {
        return n1.getEdges().add(new Edge(n2));
    }

    public boolean addNode(Node n) {
        return nodes.add(n);
    }

    public String bfs(Node node) {
        String s = "";
        LinkedList<Node> visited = new LinkedList<>();

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);

        while(queue.size() != 0){
            node = queue.get(0);
            visited.add(node);
            //print node
            s += ("Name: " + node.getName() + " Value: " + node.getValue() + "\n");
            System.out.print(s);
            for (Edge e:node.getEdges()) {
                Node nextNode = e.getDestNode();
                if(!visited.contains(nextNode) && !queue.contains(nextNode))
                    queue.add(nextNode);
            }
            queue.remove(0);
        }
        return s;
    }
    String dfsUtil(Node node, LinkedList<Node> visited) {
        visited.add(node);
        String s = ("Name: " + node.getName() + " Value: " + node.getValue() + "\n");
        System.out.print(s);

        for (Edge e:node.getEdges()) {
            Node nextNode = e.getDestNode();
            if(!visited.contains(nextNode)){
                visited.add(nextNode);
                s += dfsUtil(nextNode,visited);
            }
        }
        return s;
    }

    public String dfs(Node node) {
        LinkedList<Node> visited = new LinkedList<>();
        return dfsUtil(node,visited);
    }

}
