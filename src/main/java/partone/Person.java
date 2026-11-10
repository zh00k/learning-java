package partone;

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
        new Person("Igor", "Syn'ak", 67).introduce();
    }

    public void introduce() {
        System.out.println(
                "Привет, меня зовут "
                        + firstName + " " + lastName + "."
                        + " Мне " + age + " лет."
                          );
    }
}
