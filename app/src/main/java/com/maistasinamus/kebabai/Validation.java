package com.maistasinamus.kebabai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final String CREDENTIALS_PATTERN = "^[a-zA-Z0-9]{3,20}$";
    private static final String CREDENTIALS_PATTERN_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,30}$";

    public static boolean isValidCredentials(String credentials){
        Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN);
        Matcher matcher = pattern.matcher(credentials);
        return matcher.find();
    }
    public static boolean  IsvalidEmail_Credentials (String Credentials ) {
        Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(Credentials);
        return matcher.find();

    }
}
