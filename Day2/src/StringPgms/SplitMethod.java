package StringPgms;


public class SplitMethod {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
