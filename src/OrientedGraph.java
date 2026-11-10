public class OrientedGraph<T> extends Graph<T{

    @Override
    public void addEdge(T start, T dest, float weight) {
        nodes.get(start).addAdj(nodes.get(dest), weight);
    }
}
