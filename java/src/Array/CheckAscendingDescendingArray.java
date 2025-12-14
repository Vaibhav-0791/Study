package Array;

public class CheckAscendingDescendingArray {
    static int myArray[] = {5,3,3,2};

    public static void main(String[] args) {
        System.out.println(isArrayAscending(myArray));
        System.out.println(isArrayDescending(myArray));

    }


    public static boolean isArrayAscending(int[] myArray){
        for(int i =1;i<myArray.length;i++){
            if(!(myArray[(i-1)]<=myArray[i])){
                return false;}
        }
        return true;
    }
  public static boolean isArrayDescending(int []getArray){
        for (int i=1;i<getArray.length;i++){
            if(!(getArray[(i-1)]>=getArray[i])){
                return false;
            }
        }
        return true;
  }
}
