import java.awt.*;
import java.sql.Array;
import java.util.List;
import java.util.Locale;

public class PigLatin {
    public static int firstVowel(String myWord){
        myWord = myWord.toLowerCase();
        int firstVowelInd = Integer.MAX_VALUE;
        if (myWord.contains("a")){
            if (myWord.indexOf("a") < firstVowelInd) firstVowelInd = myWord.indexOf("a");
        } if (myWord.contains("e")) {
            if (myWord.indexOf("e") < firstVowelInd) firstVowelInd = myWord.indexOf("e");
        } if (myWord.contains("i")){
            if (myWord.indexOf("i") < firstVowelInd) firstVowelInd = myWord.indexOf("i");
        } if (myWord.contains("o")){
            if (myWord.indexOf("o") < firstVowelInd) firstVowelInd = myWord.indexOf("o");
        } if (myWord.contains("u")) {
            if (myWord.indexOf("u") < firstVowelInd) firstVowelInd = myWord.indexOf("u");
        } return firstVowelInd;
    }
    public static String makePigLatin(String myWord) {
        myWord = myWord.toLowerCase();
        int firstVowelLocation = PigLatin.firstVowel(myWord);
        String translation;
        if (firstVowelLocation == 0){
            translation = myWord + "yay";
        } else if (myWord.contains("y")) {
            if (myWord.indexOf("y") != 0){
                if (myWord.indexOf("y") < firstVowelLocation) firstVowelLocation = myWord.indexOf("y");
                translation = myWord.substring(firstVowelLocation) + myWord.substring(0,firstVowelLocation) + "ay";
            } else translation = myWord.substring(firstVowelLocation) + myWord.charAt(0) + "ay";
        } else{
            translation = myWord.substring(firstVowelLocation) + myWord.substring(0,firstVowelLocation) + "ay";
        } return translation;
    }
}