package practiseTasks.day_29.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {
    /*
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement*/
    private String programmingLanguage;


    public void setInfo(String name, String id, String jobTitle, String programmingLanguage, int age, double salary, char gender) {
        setInfo(name,id,jobTitle,age,salary,gender);
        setProgrammingLanguage(programmingLanguage);

    }



    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String > language= new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
        if(language.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        }else{
            System.err.println("Invalid Language: "+programmingLanguage);
        }
    }



public void coding(){
    System.out.println(getJobTitle()+getName()+" is coding");
}


}
