package _Java.IT_Class.M24_Patterns;

import java.util.LinkedList;

public class EulerPath {

    static class Graph {
        private int V;
        private LinkedList<Integer> adj[];

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);
        }

        int countDegrees(int v) {
            return adj[v].size();
        }

        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;

            for (Integer n : adj[v]) {
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        boolean isConnected() {
            boolean visited[] = new boolean[V];
            int i;
            for (i = 0; i < V; i++) {
                if (!adj[i].isEmpty())
                    break;
            }

            if (i == V)
                return true;

            DFSUtil(i, visited);

            for (i = 0; i < V; i++) {
                if (!visited[i] && adj[i].size() > 0) {
                    return false;
                }
            }

            return true;
        }

        int isEulerian() {
            if (!isConnected()) {
                return 0;
            }

            int odd = 0;
            for (int i = 0; i < V; i++) {
                if (countDegrees(i) % 2 != 0) {
                    odd++;
                }
            }

            if (odd > 2) {
                return 0;
            }

            return (odd == 0) ? 2 : 1;
        }

        public static void main(String[] args) {
            Graph g = new Graph(4);
            //g.addEdge(0, 1);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(0, 3);
            g.addEdge(0, 3);
            g.addEdge(1, 2);
            g.addEdge(2, 3);

            int res = g.isEulerian();
            if (res == 0) {
                System.out.println("Граф не является эйлеровым");
            } else if (res == 1) {
                System.out.println("Граф имеет эйлеров цикл");
            } else {
                System.out.println("Граф имеет эйлеров путь");
            }
        }
    }
}