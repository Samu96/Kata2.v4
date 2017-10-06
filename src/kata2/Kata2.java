package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] array = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        Histogram histo = new Histogram(array);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        System.out.println("=============");
        System.out.println(Arrays.asList(histogr));
        System.out.println("=============");
        System.out.println(histogr.entrySet());
        
    }
}
