package day_26_statics.studentTask;

import java.util.ArrayList;

public class StudentsGroup {
    public String groupName;
    public int groupId;
    public ArrayList<Student> students= new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void addStudent(String name, String id, int age, char gender){
        //Student student= new Student(name,id,age,gender);
        students.add(new Student(name,id,age,gender));

    }
    public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
