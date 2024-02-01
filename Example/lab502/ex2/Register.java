package lab502.ex2;
public class Register {
    private Student student;
    private Subject[] subject = new Subject[10];
    private int subCount = 0;
    private final int CREDIT_COST = 800;

    public Register(Student student){
        this.student = student; 
    }

    public Student getStudent(){
        return student;
    }

    public void enroll(Subject sub){
        subject[subCount] = sub;
        System.out.println(student.getName() + " enrolled " + subject[subCount].getSubjName() + " [" + subject[subCount].getSubjMajor() + "]: " + subject[subCount].getCredit() + "credits");
        subCount++ ;
    }

    public double getTotalPayment(){
        double totalPayment = 0.0;
        for(int i = 0 ; i < subCount ; i++){
            if(!subject[i].getSubjMajor().equals(student.getMajor())){
                totalPayment += subject[i].getCredit()*CREDIT_COST ;
            }
        }
        return totalPayment;
    }

    public double getScholarship(){
        double scholarship = 0.0;
        for(int i = 0 ; i < subCount ; i++){
            if(subject[i].getSubjMajor().equals(student.getMajor())){
                scholarship += subject[i].getCredit()*CREDIT_COST ;
            }
        }
        return scholarship;
    }
}