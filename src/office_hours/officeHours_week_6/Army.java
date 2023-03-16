package office_hours.officeHours_week_6;

public class Army {
    public static void main(String[] args) {
eligibleToArmy(45,false,false);
    }
    /*(25, true, true) -> You are qualified to join the Army

        (45, true, true) -> You are NOT qualified to join the Army:
                            45 is more than our maximum age

        (16, false, false) ->   You are NOT qualified to join the Army:
                                16 is less than our minimum age
                                You must have a high school diploma
                                You must be a citizen*/
    public  static void eligibleToArmy (int age, boolean hasDiploma, boolean isCitizen){
String result="";
        if((age>=18&&age<=35)&hasDiploma&isCitizen){
result="You are qualified to join the Army";
        }else{
            result="You are NOT qualified to join the Army:\n";
            if(age>35){
                result+=age+" is more than our maximum age";
            } else if (age<18) {
                result+=age+" is less than our minimum age";
            }
            if(!hasDiploma){
                result+="\nYou must have a high school diploma";
            }
            if(!isCitizen){
                result+="\nYou must be a citizen";
            }
        }
        System.out.println(result);
    }

}
