package lesson3;


public class Customer {
    private String name;
    private int age;
    private Gender gender;

public Customer(String name, int age, Gender gender){
    this.name = name;
    this.age = age;
    this.gender = gender;

}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
