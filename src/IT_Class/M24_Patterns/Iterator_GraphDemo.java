package IT_Class.M24_Patterns;

import java.util.*;
public class Iterator_GraphDemo {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("Витебск");
        graph.addVertex("Минск");
        graph.addVertex("Брест");
        graph.addVertex("Гродно");
        graph.addVertex("Гомель");
        graph.addVertex("Могилев");
        graph.addEdge("Витебск", "Минск");
        graph.addEdge("Минск", "Брест");
        graph.addEdge("Минск", "Гродно");
        graph.addEdge("Минск", "Гомель");
        graph.addEdge("Минск", "Могилев");
        graph.addEdge("Витебск", "Могилев");
        graph.addEdge("Витебск", "Гомель");

        //Обход графа (проверить оба способа)
        Set<String> path = graph.depthFirstTraversal("Витебск");
        System.out.println(Arrays.toString(path.toArray()));

        GraphIterator graphIterator = new GraphIterator(graph, "Витебск");
        while (graphIterator.hasNext())
            System.out.println(graphIterator.next());
    }
}
//Реализация графа взята с https://www.baeldung.com/java-graphs
class Graph {
    private Map<String, List<String>> adjVertices = new HashMap<>();

    //Граф содержит вершины и ребра
    void addVertex(String label) {
        adjVertices.putIfAbsent(new String(label), new ArrayList<>());
    }

    void addEdge(String label1, String label2) {
        String v1 = adjVertices.keySet().stream()
                .filter(vertex -> vertex.equals(label1))
                .findFirst()
                .orElse(null);

        String v2 = adjVertices.keySet().stream()
                .filter(vertex -> vertex.equals(label2))
                .findFirst()
                .orElse(null);

        if (v1 != null && v2 != null) {
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
        }
    }

    List<String> getAdjVertices(String label) {
        return adjVertices.get(label);
    }

    //Алгоритм обхода в глубину (Depth-First Search, DFS)
    //Помещать методы обхода в реализацию графа - не лучший вариант (граф обрастает методами)
    Set<String> depthFirstTraversal(String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (String v : getAdjVertices(vertex)) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }
    Set<String> breadthFirstTraversal(String root) {
        Set<String> visited = new LinkedHashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (String v : getAdjVertices(vertex)) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        return visited;
    }
}

class GraphIterator implements Iterator{
    private Graph graph;
    private String root;
    private String current;
    Set<String> vertices;
    Iterator iterator;

    public GraphIterator(Graph graph, String root){
        this.graph = graph;
        this.root = root;
        this.current = root;
        vertices = graph.depthFirstTraversal(root);
        iterator = vertices.iterator();
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}