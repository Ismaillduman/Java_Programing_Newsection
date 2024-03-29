package practiseTasks.day_27;

public class CydeoStudent {
    /* create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()*/
    public  String name;
    public  char gender;
    public int age,batchNumber,groupNumber;
    public  static String schoolName,fieldOfStudy,programmingLanguage,secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName="CYDEO School";
        fieldOfStudy="SDET";
        programmingLanguage="Java";
        secretCode="wooden spoon";
    }
    public  static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }
    public  static void printSecretCode(){
        System.out.println("secretCode = " + secretCode);
    }
    public void attendClass(){
        System.out.println(name+" attend the class");
    }
    public  void study(){
        System.out.println(name+" is studying "+fieldOfStudy);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public static void main(String[] args) {
        CydeoStudent student= new CydeoStudent("Clark",'M',45,29,5);
        student.attendClass();
        student.study();
        System.out.println(student);
    }
}
