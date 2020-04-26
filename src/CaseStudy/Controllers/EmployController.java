package CaseStudy.Controllers;

import CaseStudy.Commons.FuncGeneric;
import CaseStudy.Models.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static CaseStudy.Controllers.MainController.backMainMenu;

public class EmployController {
    public static void showInformationEmployee(){
        ArrayList<Employee> employeeList = FuncGeneric.getLisFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        Map<String,Employee> map = new HashMap<>();
        for(Employee employee: employeeList){
            map.put(employee.getId(),employee);
        }
        displayMap(map);
        backMainMenu();
    }

    public static void displayMap(Map<String, Employee> map){
        for(Map.Entry m : map.entrySet()){
            System.out.println("Key : " + m.getKey() + "\n" + m.getValue().toString());
        }
    }

    public static void findEmployeeFromResume(){
//        Stack<Employee> employeeStack = Resume.getAllEmployee();
    }
}
