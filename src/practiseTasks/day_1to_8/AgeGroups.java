package practiseTasks.day_1to_8;

import javax.management.MBeanAttributeInfo;

public class AgeGroups {
    public static void main(String[] args) {
        String result;
        int age = -45;

        result= (age==1||age==2) ? "infant" : (age<=5&&age>=3) ? "Toddler": (age>=6&&age<=9) ? "Kid": (age>=10&&age<=12) ? "Pre-Teen"
                : (age<=17&&age>=13) ? "Teenager" : (age>=18&&age<=20) ? "Young Adult" : (age<=39&&age>=21) ?"Adult":
                (age<=49&&age>=40) ? " Young Middle-Aged Adult" :(age>=50&&age<=50) ? "  Middle-Aged Adult" : (age>=55&&age<64) ?
                " Very Young Senior Citizen" : (age>=65&&age<=74) ?"Young Senior Citizen" : (age<=84&&age>=75) ?
                "  Senior Citizen" : (age>=85) ?"Old Senior Citizen" : "Enter valid age";
        System.out.println("result = " + result);

//        if (age < 150 && age > 0) {
//            if (age < 21) {git reflohq
//
//
//                result = "Teenagers";
//
//            } else if (age >= 21 && age < 55) {
//                result = "Adult";
//            } else if (age > 55) {
//                result = "Senior";
//            }
//
//
//        } else {
//            result = "invalid AGE range";
//        }
//
//        System.out.println("result = " + result);

    }
}
