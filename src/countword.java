public class countword {
    public static void main(String[] args) {
        String text="Hello welcome to my channel youtube name is sisoriyavong";
        WordCounter wordCounter = t->t.split("\\s+").length;
        WordCounter wc = text1 -> text1.length();
        System.out.println(wordCounter.count(text));
        System.out.println(wc.count(text));
    }
    interface WordCounter{
        int count(String text);
    }
}
