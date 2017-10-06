package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] array;


    public Histogram(T[] array) {
        this.array = array;
    }
    
    public T[] getArray() {
        return array;
    }
    
    public Map<T,Integer> getHistogram(){
        Map <T,Integer> datos = new HashMap<>();
        for (T i: array) {
            datos.put(i, datos.containsKey(i) ? datos.get(i) + 1 : 1);
        }
        return datos;
    }
}
