import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String user;
    private String password;

    public boolean checkUser() {
        int minLength = 8;
        Pattern pattern = Pattern.compile(".\\W");
        Matcher matcher = pattern.matcher(user);

        boolean lengthValid = user.length() >= minLength;
        boolean containsSpecialCharacters = matcher.find();

        return lengthValid && !containsSpecialCharacters;
    }

    public boolean checkPassword() {
        int minLength = 8;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(password);

        boolean containsNumers = matcher.find();
        boolean lengthValid = password.length() >= minLength;

        pattern = Pattern.compile("\\d", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(password);
        boolean containsUpperCaseChar = matcher.find();

        pattern = Pattern.compile(".\\W");
        matcher = pattern.matcher(password);
        boolean containsSpecialCharacters = matcher.find();

        return containsNumers && lengthValid && containsUpperCaseChar && containsSpecialCharacters;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
