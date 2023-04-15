package day_29_inheritance.encapsulation;

public class Student {
    private String name;
    private static String schoolName;
    private int age,grade;
    private char gender;

    public  String getName(){
//        if(name==null){
//            name="unknown";
//        }
        return name;
    }
    public void  setName(String name){
//        if(name.isEmpty()||name.isBlank()){
//            System.err.println("Invalid student name");
//            System.exit(1);
//        }
       this.name=name;
    }


    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>90||age<5){
            System.err.println("invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
