package Regex_Junit_06_02_2026.Regex;

public class ValidateHexColorCode {
    public static boolean isValidHex(String color){
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidHex("#FFA500"));
        System.out.println(isValidHex("#ff4500"));
        System.out.println(isValidHex("#123"));
        System.out.println(isValidHex("123456"));
    }
}
