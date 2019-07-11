package practice05;

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
        return String.format("%s I am a Student. I am at Class %d.",super.introduce(), klass);
    }
}
