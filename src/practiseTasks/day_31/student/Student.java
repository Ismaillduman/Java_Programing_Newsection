package practiseTasks.day_31.student;

public class Student extends Person{
    private String studentId,fieldOfStudy;
    private  char grade;
    private  String schoolName;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null||fieldOfStudy.isEmpty()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
    System.err.println("Invalid grade");
    System.exit(1);
}
    this.grade = grade;


    }

    public  String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null||schoolName.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying "+fieldOfStudy);
    }

    @Override
    public String toString() {
        return "Student{" +super.toString().replace("}","")+
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                '}';
    }

    /*Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
*/
}
