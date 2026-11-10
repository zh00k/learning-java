package parttwo;

import java.util.List;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int    age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    public static void main(String[] args) {
        // Person person = new Person();
        // person.firstName = "Aboba";
        // person.lastName = "Birobijan";
        // person.age = 68;
        // person.introduce();

        List<Person> persons = List.of(
                new Person("Aboba", "Birobijan", 68),
                new Person("Vitaly", "Zalupkin", 77),
                new Person("Valery", "Zhmishenko", 74)
                                      );

        persons.forEach(Person::introduce);
    }

    public void introduce() {
        System.out.println(
                "Привет, меня зовут "
                        + firstName + " " + lastName + "."
                        + " Мне " + age + " лет."
                          );
    }
}
