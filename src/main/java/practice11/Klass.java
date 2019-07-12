package practice11;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int klass) {
        this.number = klass;
        displayName = "Class " + number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() == number) {
            leader = student;
            System.out.printf("I am Tom. I know " + student.getName() + " become Leader of Class " + getNumber() + ".\n");
            return;
        }

        System.out.printf("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        if (!isIn(student)) {
            System.out.printf("I am Tom. I know " + student.getName() + " has joined Class " + getNumber() + ".\n");
        }
        student.getKlass().setNumber(number);
    }

    public boolean isIn(Student student) {
        if (student.getKlass().getNumber() == getNumber()) {
            return true;
        }
        return false;
    }
}
