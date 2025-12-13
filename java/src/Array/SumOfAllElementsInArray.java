package Array;

public class SumOfAllElementsInArray {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};

    public static void main(String[] args) {
        getSumOfArray(myArray);
    }

    static Integer getSumOfArray(int myArray[]){
        int sumOFElement =0;
        for (int num :myArray){
            sumOFElement =sumOFElement+num;
        }
        System.out.println("Sum Of Array : "+ sumOFElement);
        return sumOFElement;
    }
}
