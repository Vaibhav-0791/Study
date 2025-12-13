package Array;

public class LargestElementInArray {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};


    public static void main(String[] args) {
        getLargestElementInArray(myArray);
    }

    public static Integer getLargestElementInArray(int[] myArray){
        int maxNumb = Integer.MIN_VALUE;
        for (int num:myArray){
            if (num>maxNumb){
                maxNumb = num;
            }
        }
        System.out.println("Max Value is : "+ maxNumb);
        return maxNumb;
    }
}
