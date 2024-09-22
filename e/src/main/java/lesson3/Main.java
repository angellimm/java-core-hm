package lesson3;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import static lesson3.Employee.birthDateComparator;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Sergey", LocalDate.of(1999, 11, 15), 45000, Gender.male);
        Employee emp2 = new Employee("Oleg", LocalDate.of(1999, 5, 15), 50000, Gender.male);
        HeadEmployee head = new HeadEmployee("Sasha", LocalDate.of(1980, 12, 29), 80000, Gender.female);

        employees.add(emp2);
        employees.add(emp1);
        employees.add(head);
        
        List<Customer> customers = new ArrayList<>();
        Customer cust1 = new Customer("Lera", 19, Gender.female);
        Customer cust2 = new Customer("Misha", 31, Gender.male);
        Customer cust3 = new Customer("Vika", 21, Gender.female);

        customers.add(cust1);
        customers.add(cust2);
        customers.add(cust3);

        System.out.println(cust1.getName() + " " + cust1.getAge() + " " + cust1.getGender());
        System.out.println(cust2.getName() + " " + cust2.getAge() + " " + cust2.getGender());
        System.out.println(cust3.getName() + " " + cust3.getAge() + " " + cust3.getGender());

        System.out.println(emp1.getName() + " " + emp1.getGender());
        System.out.println(emp2.getName() + " " + emp2.getGender());
        System.out.println(head.getName() + " " + head.getGender());

        Holiday currentHoliday = getCurrentHoliday();
        celebration(employees, currentHoliday);

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
private static Holiday getCurrentHoliday() {
        
    return Holiday.defendersDay;
}
        private static void celebration(List<Employee> employees, Holiday holiday){
            for (Employee employee : employees){
                if (holiday == Holiday.noHoliday) {
                    System.out.println(employee.getName() + " have a normal day!"); }
                    else if (holiday == Holiday.defendersDay && employee.getGender() == Gender.male){
                        System.out.println(employee.getName() + " happy men's day!");
                    }
                    else if (holiday == Holiday.newYear){
                        System.out.println(employee.getName() + " happy new year!");
                    }
                        else if(holiday == Holiday.internationalWomensDay && employee.getGender() == Gender.female){
                            System.out.println(employee.getName() + " happy women's day!");
                        }
                        
                    }
                }
            }
            
        
        


