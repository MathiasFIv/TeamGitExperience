package tv.safte.teamgitexperiene1;

import java.util.HashMap;
import java.util.List;

public interface Graph<T> {

    HashMap<T, List<T>> getMap();
    
    List<T> getNeighbors(T vertex);

    List<T> getVertexes();

    void addVertex(T vertex, T neighbor);

    void addVertex(T vertex);

    void remove (T vertex);

    void removeNeighborOfVertex(T vertex, T neighbor);
}
