import java.util.Scanner;

public class main_person {
    public static void main(String[] args) {
        System.out.println("Введите фамилию");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();

        System.out.println("Введите имя ");
        String name = scanner.nextLine();

        System.out.println("Введите отчество ");
        String middleName = scanner.nextLine();

        System.out.println("Введите возраст ");
        int age = scanner.nextInt();

        person human = new person(surname, name, middleName, age);

        System.out.println("Год рождения созданного объекта: " + human.getBirthYear(age));

    }
}
