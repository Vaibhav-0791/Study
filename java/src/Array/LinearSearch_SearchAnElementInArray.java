package Array;

public class LinearSearch_SearchAnElementInArray {
    static int myArray[] = {-12, 3, 0, 14, 5, 6, 0};

    public static void main(String[] args) {
        elementInArray(myArray,48);
    }


    static void elementInArray(int[] myArray, int element) {
        boolean foundElement = true;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == element) {
                foundElement = false;
                System.out.println("Index of " + element + " is : " + (i+1));
            }
        }

        if (foundElement) {
            // we can throw exception
            System.out.println("Element is not present");
        }

    }
}
