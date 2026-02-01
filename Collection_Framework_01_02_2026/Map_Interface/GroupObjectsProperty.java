package Collection_Framework_01_02_2026.Map_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupObjectsProperty {
    public static void groupEmp(List<EmployeesMap> emp, HashMap<String , List<String>> hm){

        for(EmployeesMap e: emp){
            String d = e.dep;
            String n = e.name;

            if(!hm.containsKey(d)){
                hm.put(d, new ArrayList<>(Arrays.asList(n)));
            }
            else{
                hm.get(d).add(n);
            }
        }
    }

    public static void main(String[] args) {
        List<EmployeesMap> emp = new ArrayList<>();

        emp.add(new EmployeesMap("Alice", "HR"));
        emp.add(new EmployeesMap("Bob", "IT"));
        emp.add(new EmployeesMap("Carol", "HR"));

        HashMap<String , List<String>> hm = new HashMap<>();

        groupEmp(emp, hm);

        System.out.println(hm);
    }
}

class EmployeesMap{
    String name;
    String dep;

    public EmployeesMap(String name, String dep){
        this.name =name;
        this.dep = dep;
    }
}
