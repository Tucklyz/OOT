package lab502.ex2;
public class Student{
    private String name;
    private String sid;
    private String major;

    // Constructor
    public Student(String sid, String name, String major) {
        this.name = name;
        this.sid = sid;
        this.major = major;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public String getSid() {
        return sid;
    }
    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public void setMajor(String major) {
        this.major = major;
    }
}