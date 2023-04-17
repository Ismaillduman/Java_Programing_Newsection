package daily_lessons.day_29_inheritance.encapsulation;

public class Student {
    private String name;
    private  String schoolName;
    private int age;
    private char gender,grade;

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


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public char getGrade() {
        return grade;
    }

    public Student(String name, String schoolName, int age, char gender, char grade) {
       setName(name);
       setGrade(grade);
       setAge(age);
       setGender(gender);
       setSchoolName(schoolName);

    }


    public void setGrade(char grade) {
        boolean isValid=grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F';
        if(isValid){
        this.grade = grade;}
        else{
            System.err.println("invalid grade: "+grade);
            System.exit(1);
        }


    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M'||gender=='F'){
            this.gender = gender;
        }else{
            System.err.println("invalid gender: "+gender);
            System.exit(1);
        }

    }

    public void study(){
        System.out.println(name+" is studying at the "+schoolName);
    }
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +

                '}';
    }
}
