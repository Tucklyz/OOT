package lab502.ex1;

public class Team {
    private String name = "";
    private String tid = "";
    private int person = 0;
    private University university = new University();
    
    public Team(){}

    public Team(String tid, String name) {
        this.name = name;
        this.tid = tid;
    }

    public Team(String tid, String name, int person) {
        this.name = name;
        this.tid = tid;
        this.person = person;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTid() {
        return tid;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }
    public int getPerson() {
        return person;
    }
    public void setPerson(int person) {
        this.person = person;
    }
    public University getUniversity() {
        return university;
    }
    public void setUniversity(University university) {
        this.university = university;
    }
}