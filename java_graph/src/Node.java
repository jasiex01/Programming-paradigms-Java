import java.util.LinkedList;

class Node{
    private int value;
    private String name;
    private LinkedList<Edge> edgeList;

    public Node(int value, String name){
        this.value = value;
        this.name = name;
        edgeList = new LinkedList<Edge>();
    }

    public int getValue(){
        return value;
    }

    public LinkedList<Edge> getEdges(){
        return edgeList;
    }

    public String getName() {
        return name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }
}