package practiseTasks;

import javax.management.MBeanAttributeInfo;

public class AgeGroups {
    public static void main(String[] args) {
        String result = "";
        int age = 120;

        if (age < 150 && age > 0) {
            if (age < 21) {
                result = "Teenagers";
            } else if (age >= 21 && age < 55) {
                result = "Adult";
            } else if (age > 55) {
                result = "Senior";
            }
        } else{result="invalid AGE range";}
        System.out.println(result);
    }
}
