package daily_lessons.day_08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
//        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'||grade=='F') {
//            switch (grade) {
//                case 'A':
//                    result = "Excellent";
//                    break;
//                case 'B':
//                    result = "GreatJob";
//                    break;
//                case 'C':
//                    result = "Good";
//                    break;
//                case 'D':
//                    result = "passed";
//                    break;
//                case 'F':
//                    result = "Failed";
//                    break;
//
//
//            }
//        } else {
//            result = "NOT Such a grade";
//        }

            switch (grade) {
//                default:
//                    result="Not such a grade";
//                    break;
                case 'A':
                    result = "Excellent";
                    break;
                case 'B':
                    result = "GreatJob";
                    break;
                case 'C':
                    result = "Good";
                    break;
                case 'D':
                    result = "passed";
                    break;
                case 'F':
                    result = "Failed";
                    break;
                default:
                    result="Not such a grade";



            }

        System.out.println(result);
    }
}
