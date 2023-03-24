package office_hours.week_6;

public class Syllables {
    public static void main(String[] args) {
        System.out.println(syllables("ham-bur-ger"));
    }
    public static int syllables(String word){

        int syllable=1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='-'){
                syllable++;
            }
        }

        return syllable;
    }
}
