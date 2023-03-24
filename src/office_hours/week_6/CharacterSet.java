package office_hours.week_6;

public class CharacterSet {
    public static void main(String[] args) {
        System.out.println(characterSet("lowercase"));
    }

    public static String characterSet(String character) {
        String result = "";
        char star = ' ';
        char end = ' ';


        /*uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.*/

        switch (character) {
            case "uppercase":
                star = 'A';
                end = 'Z';
                break;
            case "lowercase":
                star = 'a';
                end = 'z';
                break;
            case "digit":
                star = '1';
                end = '9';
                break;
            case "special":
                star = ' ';
                end = '.';
                break;
            default:
                return "Invalid group";

        }

        for (char i = star; i < end; i++) {
            result +=i;
        }
        return result;
    }


}
