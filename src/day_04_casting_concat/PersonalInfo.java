package day_04_casting_concat;

public class PersonalInfo {

        String firstName, lastName,favoriteMusic,favoriteBook,favoriteShow,favoriteColor;
        char gender;
        int age;

        boolean marriedStatus,employeeStatus;


    public PersonalInfo(String firstName, String lastName, String favoriteMusic, String favoriteBook, String favoriteShow,
                        String favoriteColor, char gender, int age, boolean marriedStatus, boolean employeeStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteMusic = favoriteMusic;
        this.favoriteBook = favoriteBook;
        this.favoriteShow = favoriteShow;
        this.favoriteColor = favoriteColor;
        this.gender = gender;
        this.age = age;
        this.marriedStatus = marriedStatus;
        this.employeeStatus = employeeStatus;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", favoriteMusic='" + favoriteMusic + '\'' +
                ", favoriteBook='" + favoriteBook + '\'' +
                ", favoriteShow='" + favoriteShow + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", marriedStatus=" + marriedStatus +
                ", employeeStatus=" + employeeStatus +
                '}';
    }
}


