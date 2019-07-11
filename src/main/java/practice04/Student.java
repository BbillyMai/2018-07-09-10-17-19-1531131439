package practice04;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int kclass) {
        super(name, age);
        this.klass = kclass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", getName(), getAge(), klass);
    }
}
