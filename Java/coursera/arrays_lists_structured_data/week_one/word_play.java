import edu.duke.*;

public class WordPlay {
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {

            return true;
        } else
            return false;

    }

    public String replaceVowels(String phrase, char ch) {
        StringBuilder text = new StringBuilder(phrase);
        boolean test = false;
        for (int i = 0; i < text.length(); i++) {
            test = isVowel(text.charAt(i));
            if (test == true) {
                text.setCharAt(i, ch);
            }
        }
        return text.toString();

    }

    public String emphasize(String phrase, char ch) {
        StringBuilder text = new StringBuilder(phrase);
        char chUpper = Character.toUpperCase(ch);
        char chLower = Character.toLowerCase(ch);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == chUpper || text.charAt(i) == chLower) {
                if (i % 2 == 0)
                    text.setCharAt(i, '*');
                else
                    text.setCharAt(i, '+');
            }
        }
        return text.toString();
    }

    public void testisVowel() {
        boolean chars = isVowel('A');
        System.out.println(chars);

    }

    public void testreplaceVowels() {
        String phrase = "Hello World";
        char ch = '*';
        String newPhrase = replaceVowels(phrase, ch);
        System.out.println(newPhrase);

    }

    public void testEmphasize() {
        String phrase = "Mary Bella Abracadabra";
        char ch = 'a';
        String newPhrase = emphasize(phrase, ch);
        System.out.println(newPhrase);
    }
}
