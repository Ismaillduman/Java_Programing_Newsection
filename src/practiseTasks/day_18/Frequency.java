package practiseTasks.day_18;

public class Frequency {
    public static void main(String[] args) {
        String str = "aaabbccccddeeee";
        int max = 0;

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
//                    str.replace("" + str.charAt(i), "");
//                    result = "" + str.charAt(j);
                    count++;
                }

            }
            if (count > max) {
                max = count;
            }

        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)){
                    count++;
                }

            }

            if(count == max && !result.contains(ch+"")){
                result += "\n" + ch;
            }
        }
        System.out.print(result);

    }
}
