package Array;

public class CountEvenAndOddNumbers {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};
    static int EVEN_NUM = 0;
    static int ODD_NUM = 0;

    public static void main(String[] args) {
        getEvenAndOddCount(myArray);
    }

    static void getEvenAndOddCount(int[] myNum) {
        for (int num : myNum) {
            if (num % 2 == 0) {
                EVEN_NUM++;
            } else {
                ODD_NUM++;
            }
        }
        System.out.println("Even Numbers Are : " + EVEN_NUM);
        System.out.println("Odd Numbers Are : " + ODD_NUM);

    }


}
