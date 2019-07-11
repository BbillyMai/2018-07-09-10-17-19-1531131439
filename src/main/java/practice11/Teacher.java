package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (classes == null) {
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        } else {
            String str = String.format("%s I am a Teacher. I teach Class ", super.introduce());
            for (Klass klass : classes) {
                str += klass.getNumber() + ", ";
            }
            str = str.substring(0, str.length() - 2) + ".";
            return str;
        }
    }

    public String introduceWith(Student student) {
        if (getKlass() != null && student.getKlass().getNumber() != getKlass().getNumber()) {
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        } else {
            for(Klass klass:classes){
                if(klass.getNumber()==student.getKlass().getNumber()){
                    return String.format("%s I am a Teacher. I teach %s.", super.introduce(), student.getName());
                }
            }
            return String.format("%s I am a Teacher. I don't teach %s.", super.introduce(), student.getName());
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }
}
