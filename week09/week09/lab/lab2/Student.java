package week09.lab.lab2;

public class Student extends Person {
    private String major;
    private String studentID;
    
    public Student(String name, String gender, int age, String studentID, String major) {
        super(name, gender, age);
        this.studentID = studentID;
        this.major = major; 
    }
    public String getMajor() {
    return major; 
    }
    public void setMajor(String major) {
    this.major = major; 
    }
    public String getStudentID() {
    return studentID; 
    }
    public void setStudentID(String studentID) {
    this.studentID = studentID; 
    }
 
    public final void getDetails() { 
        System.out.println(super.getName() + "'s student ID is " + studentID + " and s/he studies " + major + ".");
    } 
}