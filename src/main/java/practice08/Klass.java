package practice08;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int klass) {
        this.number = klass;
        displayName = "Class " + number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student student){
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }
}
