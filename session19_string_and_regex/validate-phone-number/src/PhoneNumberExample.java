import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }
    public boolean validatePhoneNumber(String phoneNumber) {
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
