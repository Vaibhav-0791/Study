package Array;

import java.util.HashMap;
import java.util.Map;

public class CountElementFrequency {
    static int myArray[] = {5, 3, 2, 3};

    public static void main(String[] args) {
        getCountFrequency(myArray);
    }


    public static void getCountFrequency(int[]getArray){
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int num : getArray){
            myMap.put(num,myMap.getOrDefault(num,0)+1);
        }
        System.out.println(myMap);

    }
}
