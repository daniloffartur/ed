package lesson5;

public class Main {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee(
                "John L",
                "programmer",
                "j@mail.ru",
                "+7(999) 99-99-995",
                100000,
                35
        );

        employeeArray[1] = new Employee(
                "Bill N",
                "programmer",
                "j@mail.ru",
                "+7(999) 99-99-996",
                100000,
                37
        );

        employeeArray[2] = new Employee(
                "Tom H",
                "programmer",
                "b@mail.ru",
                "+7(999) 99-99-997",
                100000,
                40
        );

        employeeArray[3] = new Employee(
                "Pete V",
                "programmer",
                "p@mail.ru",
                "+7(999) 99-99-998",
                100000,
                42
        );

        employeeArray[4] = new Employee(
                "Helen B",
                "programmer",
                "h@mail.ru",
                "+7(999) 99-99-999",
                100000,
                56
        );

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age > 40) System.out.println(employeeArray[i].info());
        }
    }
}
