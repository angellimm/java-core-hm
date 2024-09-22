package lesson3;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import static lesson3.Employee.birthDateComparator;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Sergey", LocalDate.of(1999, 11, 15), 45000);
        Employee emp2 = new Employee("Oleg", LocalDate.of(1999, 5, 15), 50000);
        HeadEmployee head = new HeadEmployee("Sasha", LocalDate.of(1980, 12, 29), 80000);

        employees.add(emp2);
        employees.add(emp1);
        employees.add(head);
        
        if(birthDateComparator().compare(emp2, emp1) > 0){
            System.out.println(emp2.getName() + " is older" );
        }
        else if(birthDateComparator().compare(emp2, emp1) < 0){
            System.out.println(emp2.getName() + " is younger" );
        }
        else {
            System.out.println(emp2.getName() + " and " + emp1.getName() + " are the same age" );

        }

    for (Employee employee : employees) {
    System.out.println(employee.getName() + " " + employee.getSalary() + " before raise");
}


HeadEmployee.EmployeeSalaryRaise(employees, 10);

for (Employee employee : employees) {
    System.out.println(employee.getName() + " " +  employee.getSalary() + " after raise");

} 
}
}