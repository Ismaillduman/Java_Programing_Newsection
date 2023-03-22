package practiseTasks.day_15;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "adbdac";
        String uniq="";
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                count++;
                uniq+=" "+ch;
            }

        }
        System.out.println(uniq+" "+count);
    }

}
