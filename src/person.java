import java.time.LocalDate;

public class person {
    private String name;
    private String middleName;
    private String surname;
    private int age;

    public person(String name, String middleName, String surname, int age) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear(int age) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - age;
    }

    @Override
    public String toString() {
        return "{" + surname + " " + name + " " + middleName + ", " + age + "}";
    }


}






