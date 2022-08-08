package bai4;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    private static final String CLASS_NAME = "^[C]+[0-9]{4}+[G||H||I||K||L||M]$" ;

    public Main() {}

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
