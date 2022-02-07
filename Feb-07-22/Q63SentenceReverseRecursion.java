public class Q63SentenceReverseRecursion {
    public static void main(String[] args) {
        String sentence = "I am Leena Shree";
        String[] words = sentence.split("\\s");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
