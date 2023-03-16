package office_hours.officeHours_week_6;

public class CharacterSet2 {
    public static void main(String[] args) {
        System.out.println(characterSet('X', '}'));
        System.out.println(characterSet('1', '9'));
    }

    public static String characterSet(String character) {

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
return characterSet(star,end);

    }

public static String characterSet(char star,char end){
String result="";

    for (char i = star; i <=end ; i++) {
        result+=""+i;
    }
    return result;
}
}
