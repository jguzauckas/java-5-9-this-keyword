public class Person {
    private String name;
    private int age;

    public Person() {
        name = "";
        age = -1;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String toString() {
        return name + " is a " + oldOrYoung(this) + " person.";
    }

    public static String oldOrYoung(Person p) {
        if (p.age < 30) {
            return "young";
        } else {
            return "old";
        }
    }
}