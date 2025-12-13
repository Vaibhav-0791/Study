package Array;

public class SecondLargestElement {
    static int myArray[] = {0,-66};

    public static void main(String[] args) {
        secondLargestElementInArray(myArray);
    }


    static Integer secondLargestElementInArray (int[]myArray){
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for(int num : myArray)
        {
            if (num > largestNum){
                largestNum = num;
            }else if(num>secondLargestNum&&num!=largestNum){
                secondLargestNum = num;
            }
        }

        System.out.println("Largest Element is : "+ largestNum);

        if(secondLargestNum==Integer.MIN_VALUE){System.err.println("Dont have second smallest element");}else {
            System.out.println("Second Largest Element is : "+ secondLargestNum);
        }


        return secondLargestNum;
    }



}
