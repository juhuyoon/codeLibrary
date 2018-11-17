import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class pigLatin  {
    
        //consonants and vowels
    private static Pattern consonants = Pattern.compile("^((ch)|(th[r]?)|(sch)|(qu)|(squ))");
    private static Pattern vowels = Pattern.compile("^([aeiou]|(yt)|(xr))"); 

    private static String translateVowels(String word) {
        return word + "ay";
    }

    private static String translateConsonants(String word) {
            //performs match operations on a character sequence via interpretting Pattern
        Matcher consMatch = consonants.matcher(word);
        int suffixStart = consMatch.find() ? consMatch.end() : 1;
        return getPigWord(word, word.substring(suffixStart));
    }

    private static String getPigWord(String wholeWord, String suffix) {
        String prefix = wholeWord.substring(0, wholeWord.length() - suffix.length());
        return suffix + prefix + "ay";
    }

    public static String translate(String englishPhrase) {
        return Arrays.asList(englishPhrase.split(" ")).stream()
            .map(word -> vowels.matcher(word).find() ? translateVowels(word): translateConsonants(word))
            .collect(Collectors.joining(" "));
    }
}