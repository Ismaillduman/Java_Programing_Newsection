package reviews.review_05;

public class CountWord {
    public static void main(String[] args) {
        System.out.println(countWordContains("ahhhb ch i defhi hellohiiiiworld", "hi"));
        //System.out.println(countWordContains("aah iahiaaahh"));
        //System.out.println(countHi("ahhhb ch i defhi hellohiiiiworld", "hi"));
    }

    public static int countWordContains(String word, String containsWord) {
        int wordCount = 0;
        String wordWithoutBlank = word.replace(" ","");
        String wordWithoutContainsWord = "";
        for (int i = 0; i < word.replace(" ", "").length(); i++) {

            if (wordWithoutBlank.contains(containsWord)) {

               // wordWithoutBlank = word.replace(" ", ""); let's remove the spaces
               // wordWithoutContainsWord = wordWithoutBlank.replace(containsWord, "");  Let's remove containsWord
                //wordCount = (wordWithoutBlank.length() - wordWithoutContainsWord.length()) / containsWord.length();
                wordWithoutBlank=wordWithoutBlank.replaceFirst(containsWord,"");
                wordCount++;
            }
        }
        return wordCount;


    }
//    public static int countWordContains(String word) {
//        int wordCount = 0;
//        String wordWithoutBlank = "";
//        String wordWithoutContainsWord = "";
//        String containsWord = "hi";
//        for (int i = 0; i < word.length(); i++) {
//
//            if (word.contains(containsWord)) {
//
//                wordWithoutBlank = word.replace(" ", ""); // let's remove the spaces
//                wordWithoutContainsWord = wordWithoutBlank.replace(containsWord, ""); // Let's remove containsWord
//                wordCount = (wordWithoutBlank.length() - wordWithoutContainsWord.length()) / containsWord.length();
//            }
//        }
//        return wordCount;
//    }
//    public static int countHi(String str, String word) {
//        int count = 0;
//
//        for (int i = 0; i <= str.length(); i++) {
//            if (str.contains(word)) {
//                str = str.replaceFirst(word, "");
//                count++;
//            }
//        }
//
//        return count;
//    }
}

