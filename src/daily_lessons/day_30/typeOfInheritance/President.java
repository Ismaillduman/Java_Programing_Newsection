package daily_lessons.day_30.typeOfInheritance;

import java.time.LocalDateTime;

public class President extends Person {
    private LocalDateTime electedDate;

    public President(String name, int age, char gender, LocalDateTime DOB, LocalDateTime electedDate) {
        super(name, age, gender, DOB);
        setElectedDate(electedDate);
    }

    public LocalDateTime getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDateTime electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+" is lying");
    }
}
