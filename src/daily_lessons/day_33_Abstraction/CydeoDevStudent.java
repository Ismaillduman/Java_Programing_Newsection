package daily_lessons.day_33_Abstraction;

import daily_lessons.day_32_final_keyword.person.Person;

import java.time.LocalDate;

public class CydeoDevStudent extends Person {
private final String id;
private String batchName;
private int batchNo;
public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNo) {

        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        this.batchName = batchName;
        this.batchNo = batchNo;
    }

    static {
        programmingLanguage="Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchName(String batchName) {
        if(batchName.equalsIgnoreCase("zero to hero")||batchName.equalsIgnoreCase("alumni dev")){
            this.batchName = batchName;
        }else{
            System.err.println("invalid batch name "+batchName);
        }

    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }
}
