package lab502.ex2;
public class Subject{
    private String subjName ;
    private String subjid ;
    private String subjMajor ;
    private int credit ;

    // Constructor
    public Subject(String subjid, String subjName, String subjMajor, int credit) {
        this.subjName = subjName;
        this.subjid = subjid;
        this.subjMajor = subjMajor;
        this.credit = credit;
    }

    // Getter methods
    public String getSubjName() {
        return subjName;
    }
    public String getSubjid() {
        return subjid;
    }
    public String getSubjMajor() {
        return subjMajor;
    }
    public int getCredit() {
        return credit;
    }

    // Setter methods
    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }
    public void setSubjid(String subjid) {
        this.subjid = subjid;
    }
    public void setSubjMajor(String subjMajor) {
        this.subjMajor = subjMajor;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

}