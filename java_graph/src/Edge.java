class Edge{
    private int weight;
    private Node destNode;

    public Edge(Node dest, int weight){
        this.destNode = dest;
        this.weight = weight;
    }

    public Edge(Node dest){
        this.destNode = dest;
        this.weight = 1;
    }

    public int getWeight(){
        return weight;
    }

    public Node getDestNode(){
        return destNode;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
