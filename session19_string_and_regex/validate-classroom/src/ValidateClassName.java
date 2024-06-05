import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String classRegex = "^[ACP][0-9]{4}[GHIK]$";

    public ValidateClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(classRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
