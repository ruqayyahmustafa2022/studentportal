import java.util.*;

public class studentInfo {
    private String studentId;
    private String email;
    private String password;
    private String lastName;
    private String firstName;
    private double currentGPA;
    private List<String> classes;
    private List<String> grades;
    private int tuition;

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName(String lastName){
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCurrentGPA() {
        return currentGPA;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setGrades(List<String> grades) {
        this.grades = grades;
    }

    public int getTuition() {
        return tuition;
    }

    public studentInfo(String studentId, String email, String password, String lastName, String firstName,
                       double currentGPA, List<String> classes, List<String> grades, int tuition)
    {
        this.studentId = studentId;
        this.email = email;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.currentGPA = currentGPA;
        this.classes = classes;
        this.grades = grades;
        this.tuition = tuition;
    }

    public void printStudentInfo()
    {
        System.out.println("Last Name: " + lastName + '\n' +
                "First name: " + firstName +'\n' +
                "Student ID: " + studentId + '\n' +
                "Email Address: " + email + '\n' +
                "Classes \n" +
                "1. " + classes + " - " + grades + '\n' +
                //"2. " + classes + " - " + grades + '\n' +
               // "3. " + classes + " - " + grades + '\n' +
                "GPA: " + currentGPA +'\n' +
                "Tuition: " + tuition);
    }
}//end studentInfo Class

