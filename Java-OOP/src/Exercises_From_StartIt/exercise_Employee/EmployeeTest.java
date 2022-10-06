package Exercises_From_StartIt.exercise_Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

  public static void main(String[] args) {
    List<Employee> employees = addEmloyees();



  }

  private static List<Employee> addEmloyees() {
    List<Employee> employees = new ArrayList<>();
    Employee employee1 = new Employee("Петър Станчев", 2000);
    employees.add(employee1);
    Employee employee2 = new Employee("Стела Цвяткова", 2500);
    employees.add(employee2);
    Employee employee3 = new Employee("Емил Енчев", 2500);
    employees.add(employee3);
    Employee employee4 = new Employee("Иван Симеонов", 3000);
    employees.add(employee4);
    Employee employee5 = new Employee("Стоян Здравков", 5000);
    employees.add(employee5);

    return employees;
  }
}
