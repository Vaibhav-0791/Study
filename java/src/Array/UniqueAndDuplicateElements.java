package Array;

import java.util.HashSet;
import java.util.Set;

public class UniqueAndDuplicateElements {
    static int myArray[] = {5, 3, 2, -3};

    public static void main(String[] args) {
        //getUniqueElements(myArray);
        getDuplicateElementsUsingSet(myArray);
    }


    public static void getUniqueElements(int[] getArray) {
        for (int i = 0; i < getArray.length; i++) {
            int k = 0;
            for (int j = 0; j < getArray.length; j++) {
                if (getArray[i] == getArray[j]) {
                    k++;
                }
            }
            if (k == 1) {
                System.out.println(getArray[i]);
            }
        }
    }

public static void getDuplicateElementsUsingSet(int[]getArray){
        Set <Integer> mySet = new HashSet<>();
         for (int num : getArray){

             if (!mySet.add(num)) {System.out.println(num);}
         }

}
}
