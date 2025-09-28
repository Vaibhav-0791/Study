package StringExample;

/*
* reverse string
*check word using .equals
* e.g madam, mam, eye
*
* **/


public class palindrome {

    public static void main(String[] args) {
        isPalindrome("eyes");


    }

    private static String reverseString (String input){
        String reverseWord = "";
        for (int i = input.length()-1; i>=0;i--){

            reverseWord =reverseWord + input.charAt(i);

         }
        return reverseWord;
    }

    private static void isPalindrome(String word){
        String reverseWord = reverseString(word);
        if(reverseWord.equals(word)){System.out.println("Yes, its palindrome word");}else{System.out.println("Not, Its mot Palindrome Word");}

    }


}
