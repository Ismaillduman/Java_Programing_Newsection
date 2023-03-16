package office_hours.officeHours_week_6;

import javax.management.MBeanAttributeInfo;

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
