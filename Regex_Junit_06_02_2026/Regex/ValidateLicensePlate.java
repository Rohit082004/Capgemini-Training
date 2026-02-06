package Regex_Junit_06_02_2026.Regex;

public class ValidateLicensePlate {
    public static boolean isValidPlate(String plate){
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("AB1234"));
        System.out.println(isValidPlate("A12345"));
        System.out.println(isValidPlate("ab1234"));
        System.out.println(isValidPlate("ABC123"));
    }
}
