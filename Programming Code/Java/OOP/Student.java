package Java.OOP;

class Student extends Person {
    private double GPA;
    private String major;

    public Student(int ID, String name, int age, double GPA, String major) {
        super(ID, name, age);
        this.GPA = GPA;
        this.major = major;
    }

    // Getter methods
    public double getGPA() {
        return GPA;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
