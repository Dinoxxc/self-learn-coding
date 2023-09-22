package Java.OOP;

class Lecturer extends Person {
    private double salary;
    private String faculty;

    public Lecturer(int ID, String name, int age, double salary, String faculty) {
        super(ID, name, age);
        this.salary = salary;
        this.faculty = faculty;
    }

    // Getter methods
    public double getSalary() {
        return salary;
    }

    public String getFaculty() {
        return faculty;
    }

    // Setter methods
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
