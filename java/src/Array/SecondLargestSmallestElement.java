package Array;

public class SecondLargestSmallestElement {
    static int myArray[] = {0,-66,12,-85,1,6,9,0,1,18};

    public static void main(String[] args) {
        secondLargestElementInArray(myArray);
        secondSmallestElement(myArray);
    }


    static Integer secondLargestElementInArray (int[]myArray){
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for(int num : myArray)
        {
            if (num > largestNum){
                secondLargestNum = largestNum;
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

static Integer secondSmallestElement(int[]myArray){
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;

        for (int num : myArray){
            if(num <smallestNum){
                secondSmallestNum = smallestNum;
                smallestNum = num;
            }else if(num<secondSmallestNum && smallestNum!=num){
                secondSmallestNum = num;
            }
        }

    System.out.println("Smallest Element is : "+ smallestNum);
    if(secondSmallestNum==Integer.MAX_VALUE){System.err.println("Dont have second smallest element");}else {
        System.out.println("Second Smallest Element is : "+ secondSmallestNum);
    }
        return secondSmallestNum;
}

}
