package office_hours.officeHours_week_6;

public class CharacterSwapped {
    public static void main(String[] args) {
        System.out.println(swapped("cydeo"));
    }
    public static String  swapped(String str){
        String result="";
        char first=str.charAt(0);
        char last=str.charAt(str.length()-1);

        result=""+last+str.substring(1,str.length()-1)+first;
        return result;
    }
}
