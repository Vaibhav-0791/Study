package StringExample;


/*

* vowels = a,e,i,o,u
* Consonanats = excluding vowels, all the remaining letter
*
* we will use String.indexof(Char) --> is its match output would be  index, if it not match output would be -1
**/


public class VowelsAndConsonants {

    static int countOfConsonants = 0;
    static int countOFVowels = 0;

    public static void main(String[] args) {

        getCount("bbbbb");


    }

    private static  boolean isITVowel(char letter) {
        return "aeiou".indexOf(letter)!= -1;
    }

    private static void getCount(String input){
        char [] chr = input.toCharArray();
        for(char k : chr){
            if(isITVowel(k)){countOFVowels++;}
            else {countOfConsonants++;}
        }
        System.out.println( "Total vowels : "+ countOFVowels);
        System.out.println("Total Consoanat : "+ countOfConsonants);



    }









}
