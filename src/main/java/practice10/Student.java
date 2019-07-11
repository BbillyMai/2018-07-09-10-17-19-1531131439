package practice10;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader().getId() == super.getId()) {
            return String.format("%s I am a Student. I am Leader of Class %d.", super.introduce(), klass.getNumber());
        } else {
            System.out.println(String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass.getNumber()));
            return String.format("%s I am a Student. I am at Class %d.", super.introduce(), klass.getNumber());
        }
    }

    public Klass getKlass() {
        return klass;
    }
}
