package lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String jonny, String programmer, String email, String phone) {
    }

    public String info(){
        return String.format("fullName: %1$s, position: %2$s, email: %3$s, phone: %4$s, salary: %5$(,.2f, age: %6$2d",
                this.fullName, this.position, this.email, this.phone, this.salary, this.age);
    }
}
