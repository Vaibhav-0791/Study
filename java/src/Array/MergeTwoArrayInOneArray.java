package Array;

public class MergeTwoArrayInOneArray {
    static int Array1[] = {1, 2, 3};
    static int Array2[] = {4, 5, 6, 7};

    static int myArray[] = new int[Array1.length + Array2.length];

    public static void main(String[] args) {
        int index=0;
        for(int i = 0; i<Array1.length;i++){
            myArray[index]=Array1[i];
            index++;
        }

        for(int i = 0; i<Array2.length;i++){
            myArray[index]=Array2[i];
            index++;
        }

        for (int num : myArray){
            System.out.println(num);
        }
    }
}
