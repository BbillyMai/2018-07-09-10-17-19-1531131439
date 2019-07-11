package practice10;

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
            return;
        }

        System.out.printf("It is not one of us.\n");
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(number);
    }
}
