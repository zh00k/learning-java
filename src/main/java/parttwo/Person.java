package parttwo;

import java.util.List;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduce() {
        System.out.println(
            "Привет, меня зовут "
            + firstName + " " + lastName + "."
            + " Мне " + age + " лет."
        );
    }

    public static void main(String[] args) {
        // Раньше: пустой объект и заполнение полей по одному
        // Person person = new Person();
        // person.firstName = "Aboba";
        // person.lastName = "Birobijan";
        // person.age = 68;
        // person.introduce();

        // Сейчас: одна строка на объект через конструктор
        List<Person> persons = List.of(
                new Person("Aboba", "Birobijan", 68),
                new Person("Vitaly", "Zalupkin", 77),
                new Person("Valery", "Zhmishenko", 74)
        );

        persons.forEach(Person::introduce);
    }
}