package practice06;

public class Teacher extends Person {
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int kclass) {
        super(name, age);
        this.klass = kclass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass == 0) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());

        } else {
            return String.format("%s I am a Teacher. I teach Class %d.", super.introduce(), klass);
        }
    }
}
