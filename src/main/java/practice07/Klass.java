package practice07;

public class Klass {
    private int number;
    private String displayName;

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
}
