package daily_lessons.day_33_Abstraction;

import daily_lessons.day_32_final_keyword.person.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {
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
        if(batchNo<=0){
            System.err.println("invalid batch number "+batchNo);
            System.exit(1);
        }
        this.batchNo = batchNo;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);

    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking "+programmingLanguage);

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+

                " id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNo=" + batchNo +
                '}';
    }
}
