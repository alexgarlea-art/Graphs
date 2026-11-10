import java.util.HashMap;

public class OrientedGraph<T> extends Graph<T>{

    @Override
    public void addEdge(T start, T dest, float weight) {
        nodes.get(start).addAdj(nodes.get(dest), weight);
    }

    public HashMap<T, Distance> bellman_ford(T source){

    }

    public HashMap<T, Distance> dijkstra(T source){

    }
}
