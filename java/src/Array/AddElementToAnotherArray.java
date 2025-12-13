package Array;

public class AddElementToAnotherArray {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};

    static int myArray2[] = new int[myArray.length];


    public static void main(String[] args) {
        for(int i =0; i<myArray.length;i++){
            myArray2 [i] =myArray[i];
        }

        for (int num : myArray){
            System.out.println(num);
        }

    }


}
