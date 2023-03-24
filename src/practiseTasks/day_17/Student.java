package practiseTasks.day_17;

 public class Student {
    /*Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()*/

    String name;
    String gender;
    int age;
    int studentId;
    char grade;
    boolean isFullTime;

     void setInfo(String name, String gender, int age, int studentId, char grade, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gender = gender;
        this.grade = grade;
        this.isFullTime = isFullTime;

    }


     public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

      int study(){
       int n=0;
        System.out.println(name+" study Mathe");
        return n;
    }

}
