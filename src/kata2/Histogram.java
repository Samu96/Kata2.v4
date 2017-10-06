package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] array;


    public Histogram(int[] array) {
        this.array = array;
    }
    
    public int[] getArray() {
        return array;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map <Integer,Integer> datos = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(datos.containsKey(array[i])){
                datos.put(array[i], datos.get(array[i])+1);
            }else{
                datos.put(array[i], 1);
            }
        }
        return datos;
    }
}
