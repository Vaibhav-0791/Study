package StringExample;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("i love india");



    }

    private static String reverseString(String input) {
        String reverseString = "";
        System.out.println(input.length());

        for (int i = input.length()-1; i >= 0; i--) {
            reverseString = reverseString + input.charAt(i);
        }
        System.out.println(reverseString);

        return reverseString;
    }

}
