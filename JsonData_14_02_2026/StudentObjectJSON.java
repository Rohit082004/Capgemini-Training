package JsonData_14_02_2026;

import org.json.JSONObject;
import org.json.JSONArray;

public class StudentObjectJSON {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("AWS");
        subjects.put("SQL");

        JSONObject student = new JSONObject();
        student.put("name", "Rohit Mahajan");
        student.put("age", 21);
        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}
