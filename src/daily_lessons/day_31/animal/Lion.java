package daily_lessons.day_31.animal;

public class Lion extends Animal{

    private  boolean isAfricanLion;

    public Lion(String name, String color, String size, String breed, int age, char gender, boolean isAfricanLion) {
        super(name, color, size, breed, age, gender);
        this.isAfricanLion = isAfricanLion;
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public String toString() {
        return super.toString().replace("{","")+
                ", is African Lion=" + isAfricanLion() +
                '}';
    }
}
