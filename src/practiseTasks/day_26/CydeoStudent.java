package practiseTasks.day_26;

public class CydeoStudent {
    /*Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()*/
    public String name, id;
    public int age, grade, batchNumber, groupNumber;
    public static String schoolName = "CYDEO Virginia";
    public static String magicWord = "JAVA";

    public CydeoStudent(String name, String id, int age, int grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is study");
    }

    public void attendClass() {
        System.out.println(name + ":" + id + " attend class");
    }

    public static void printSchoolName() {
        System.out.println("schoolName = " + schoolName);
    }
    public  static void printProgLanguage(){
        System.out.println("programme language = " + magicWord);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
