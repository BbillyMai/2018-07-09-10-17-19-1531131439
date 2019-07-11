package practice09;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String nama, int age) {
        this.id = id;
        this.name = nama;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person p = (Person) object;
            if (p.getId() == this.id) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
