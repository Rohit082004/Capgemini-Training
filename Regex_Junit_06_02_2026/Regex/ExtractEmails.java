package Regex_Junit_06_02_2026.Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractEmails {
    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";

        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}