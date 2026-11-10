package app;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        Employee employee = new Employee(
                "Іван Шевченко",
                "Повар",
                "ivanshechenko@gmail.com",
                "+380991234567",
                29
        );

        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Вік: " + employee.getAge());
    }
}
