package Java.OOP;

public class Main {
    public static void main(String[] args) {
        // Pembuatan objek dari masing-masing kelas
        Person person = new Person(1, "John Doe", 30);
        Lecturer lecturer = new Lecturer(101, "Dr. Smith", 45, 60000, "Engineering");
        Student student = new Student(201, "Jane Smith", 20, 3.8, "Computer Science");

        // Output informasi dari masing-masing objek
        System.out.println("Person Info:");
        System.out.println("ID: " + person.getID());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println("\nLecturer Info:");
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Name: " + lecturer.getName());
        System.out.println("Age: " + lecturer.getAge());
        System.out.println("Salary: $" + lecturer.getSalary());
        System.out.println("Faculty: " + lecturer.getFaculty());

        System.out.println("\nStudent Info:");
        System.out.println("ID: " + student.getID());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("GPA: " + student.getGPA());
        System.out.println("Major: " + student.getMajor());
    }
}
