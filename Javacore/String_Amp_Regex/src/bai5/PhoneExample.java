package bai5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONE_REGEX = "^(0-9){2}+(-)+([0-9]{10})\\b";

    public PhoneExample() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
