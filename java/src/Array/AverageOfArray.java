package Array;

public class AverageOfArray {
    static int myArray[] = {-12, 3, 2, 14, 5, 6, 0};

    public static void main(String[] args) {
        averageOfArray(myArray);
    }

    static Integer averageOfArray (int[]myArray){
        int average = getSumOfArray(myArray)/myArray.length;
        System.out.println("Averaget of Array is : "+ average);
        return average;
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
