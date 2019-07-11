package practice02;

public class Student extends Person{
    private int klass;

    public Student(String name, int age, int kclass) {
        super(name, age);
        this.klass = kclass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return "I am a Student. I am at Class " + klass + ".";
    }
}
