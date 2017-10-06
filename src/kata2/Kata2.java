package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] array = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map <Integer,Integer> datos = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if(datos.containsKey(array[i])){
                datos.put(array[i], datos.get(array[i])+1);
            }else{
                datos.put(array[i], 1);
            }
        }
        for (int key : datos.keySet()) {
            System.out.println(key + "==>" + datos.get(key));
        }
    }
    
}
