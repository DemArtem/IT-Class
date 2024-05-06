package _Java.IT_Class.M24_Patterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SevenBridges2 {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", new ArrayList<>());
        graph.get("A").add("B");
        graph.get("A").add("C");
        graph.get("A").add("D");
        graph.put("B", new ArrayList<>());
        graph.get("B").add("A");
        graph.get("B").add("C");
        graph.get("B").add("D");
        graph.put("C", new ArrayList<>());
        graph.get("C").add("A");
        graph.get("C").add("B");
        graph.get("C").add("D");
        graph.put("D", new ArrayList<>());
        graph.get("D").add("A");
        graph.get("D").add("B");
        graph.get("D").add("C");

        boolean hasEulerianPath = hasEulerianPath(graph);
        System.out.println("Has Eulerian Path: " + hasEulerianPath);
    }

    public static boolean hasEulerianPath(Map<String, List<String>> graph) {
        int oddDegreeCount = 0;
        for (List<String> neighbors : graph.values()) {
            if (neighbors.size() % 2 != 0) {
                oddDegreeCount++;
            }
        }
        return oddDegreeCount == 0 || oddDegreeCount == 2;
    }
}