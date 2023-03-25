package replit_tasks.week_7;

public class SentenceReverse {
    public static void main(String[] args) {
        String sentence = "I love the life ";

        String[] splitSentence = sentence.split(" ");
        String[] result = new String[splitSentence.length];
        for (int i = splitSentence.length - 1, j = 0; i >= 0; i--) {
            result[j++] = splitSentence[i];
        }
        String reverse = "";
        for (int i = 0; i < result.length; i++) {
            reverse += result[i] + " ";
        }
        System.out.println(reverse.trim());
    }
}
