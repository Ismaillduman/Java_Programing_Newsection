package day_03_variables;

public class StudentInfo {

    String studentsName;
    int age;
    char gender;
    String school_name;
    String student_id;
    String grade_level;

    double gpa;

    boolean isFullTime;

    public StudentInfo(String studentsName, int age, char gender, String school_name, String student_id, String grade_level, double gpa, boolean isFullTime) {
        this.studentsName = studentsName;
        this.age = age;
        this.gender = gender;
        this.school_name = school_name;
        this.student_id = student_id;
        this.grade_level = grade_level;
        this.gpa = gpa;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentsName='" + studentsName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school_name='" + school_name + '\'' +
                ", student_id='" + student_id + '\'' +
                ", grade_level='" + grade_level + '\'' +
                ", gpa=" + gpa +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
