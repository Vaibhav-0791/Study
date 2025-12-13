package Array;

public class SmallestElementInArray {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};

    public static void main(String[] args) {
        getSmallestElementInArray(myArray);
    }

    static Integer getSmallestElementInArray(int[] myArray) {
        int minNum = Integer.MAX_VALUE;
        for (int num : myArray) {
            if (num < minNum) {
                minNum = num;
            }
        }
        System.out.println("Min Value is : " + minNum);
        return minNum;
    }
}
