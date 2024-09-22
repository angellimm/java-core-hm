package lesson3;

import java.time.LocalDate;

import java.util.List;

public class HeadEmployee extends Employee{
    public HeadEmployee(String name, LocalDate dateofBirth, int Salary, Gender gender){
    
super(name, dateofBirth, Salary, gender);
    
    }


    public static void EmployeeSalaryRaise  (List<Employee> employees, int persentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof HeadEmployee)) {
                int currentSalary = employee.getSalary();
                int raisedSalary = currentSalary / 100 * persentage + currentSalary;
                employee.setSalary(raisedSalary);
            }
        }
    }
}
