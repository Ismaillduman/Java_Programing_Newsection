package practiseTasks.day_15;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "java java javajavaj ava";
        String word = "java";
        int count = 0;
        String sentenceWithOutSpace=sentence.replace(" ","");
        while (sentenceWithOutSpace.contains(word)) {
            count++;

            sentenceWithOutSpace=sentenceWithOutSpace.replaceFirst(word,"");
        }
        System.out.println(count);
    }
}
