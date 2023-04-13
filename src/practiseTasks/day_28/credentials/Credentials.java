package practiseTasks.day_28.credentials;

import java.util.ArrayList;
import java.util.Arrays;

public class Credentials {
    private String userName, password;

    public Credentials(String userName, String password) {
        this.userName = userName;
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public boolean isStrongPassWord(String password) {

        String[] passwordArray = password.split("");

        int letter = 0;
        int digit = 0;
        int specialCharacters = 0;
        int space = 0;

        for (char each : password.toCharArray()) {
            if (Character.isDigit(each)) {
                digit++;
            }
            if (Character.isLetter(each)) {
                letter++;
            }
            if (!Character.isLetterOrDigit(each)) {
                specialCharacters++;
            }
            if (Character.isSpaceChar(each)) {
                space++;
            }
        }
        return passwordArray.length == 7 && digit > 0 && letter > 0 && specialCharacters > 0 && space == 0;

    }


    public String toString() {
        return "Credentials{" + "userName='" + userName + '\'' + ", password='" + getPassword() + '\'' + ", password is strong='" + isStrongPassWord(password) + '\'' + '}';
    }
}
