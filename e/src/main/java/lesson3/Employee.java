package lesson3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Comparator;

@ToString
@Setter
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Data

public class Employee {

private String name;
private LocalDate birthDate;
private int Salary;
private Gender gender;

public Employee(String name, LocalDate birthDate, int Salary, Gender gender) {

    this.name = name;
    this.birthDate = birthDate;
    this.Salary = Salary;
    this.gender = gender;
}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return this.Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


public static Comparator<Employee> birthDateComparator() {
   return Comparator.comparing(employee -> employee.birthDate);
}




}
