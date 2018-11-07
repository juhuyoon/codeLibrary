public class PhraseFilter implements Filter {
    private String where;
    private String phrase;
    private String name;

    public PhraseFilter(String s, String s2) {
        where = s;
        phrase = s2;
        name = "PhraseFilter";
    }

    public boolean satisfies(QuakeEntry qe) {
        String title = qe.getInfo();
        if(where.equals("start") && title.startsWith(phrase)) {
            return true;
        }  else if (where.equals("end") && title.endsWith(phrase)) {
            return true;
        } else if(where.equals("any") && title.contains(phrase)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}