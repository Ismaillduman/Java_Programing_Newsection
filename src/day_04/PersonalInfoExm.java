package day_04;

import java.util.ArrayList;
import java.util.List;

public class PersonalInfoExm {

    public static void main(String[] args) {
        List<PersonalInfo> personalInfo = new ArrayList<>();

        personalInfo.add(new PersonalInfo("john\n", "moon\n", "sunshine\n","animal farm\n","Grimm\n",
                "green\n",'M', 38, true, true));

        for (Object personal: personalInfo
             ) {
            System.out.println("personal = " + personal);
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("personalInfo = " + personalInfo);


    }
}
