package practiseTasks.day_22_array_list;

public class UpperAndLower {
    public static void main(String[] args) {
        /*Write program tha

        Ex:
            str = "JAVA java";

        output:
            true*/
       String str = "JAVA java";
int upperCount=0;
int lowerCount=0;
boolean isTotalEqual=true;
        for (char ch: str.toCharArray()) {
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            if(Character.isLowerCase(ch)){
                lowerCount++;
            }
        }
        if (upperCount==lowerCount){
            isTotalEqual=true;
        }else{
            isTotalEqual=false;
        }
        System.out.println(isTotalEqual);
    }
}
