package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArray {
    static int myArray[] = {7, -12, 3, -12, -14, 5, 6, 0};

    public static void main(String[] args) {

        sortedArrayInAscendingOrder(myArray);
        sortedArrayInDescendingOrder(myArray);

    }


    public static int[] sortedArrayInAscendingOrder(int[] getArray) {
        for (int i = 0; i < getArray.length - 1; i++) {
            for (int j = 0; j < getArray.length - i - 1; j++) {
                if (getArray[j] > getArray[j + 1]) {
                    int value = getArray[j];
                    getArray[j] = getArray[j + 1];
                    getArray[j + 1] = value;
                }
            }
        }
        System.out.println(Arrays.toString(getArray));
        return getArray;
    }


    public static int[] sortedArrayInDescendingOrder(int[] getArray) {
        for (int i = 0; i < getArray.length - 1; i++) {
            for (int j = 0; j < getArray.length - i - 1; j++) {
                if (getArray[j] < getArray[j + 1]) {
                    int value = getArray[j];
                    getArray[j] = getArray[j + 1];
                    getArray[j + 1] = value;
                }
            }
        }
        System.out.println(Arrays.toString(getArray));
        return getArray;
    }


}






