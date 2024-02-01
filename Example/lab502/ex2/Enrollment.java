package lab502.ex2;
public class Enrollment {
 public static void main(String[] args) {
    Student s1 = new Student("B6300001", "Jackson", "CPE");
    Student s2 = new Student("B6200002", "Harper", "IT");
    Student s3 = new Student("B6100003", "Carter", "ME");
    
    Subject subj1 = new Subject("523203", "Problem Solving withProgramming", "CPE", 2);
    Subject subj2 = new Subject("523232", "Object-OrientedTechnology", "CPE", 4);
    Subject subj3 = new Subject("523403", "Intelligent Methodologies","CPE", 4);
    Subject subj4 = new Subject("523423", "Software Testing", "CPE",4);
    Subject subj5 = new Subject("525101", "Engineering Graphics I","ME", 2);
    Subject subj6 = new Subject("525206", "Engineering Graphics II","ME", 2);
    
    Register r1 = new Register(s1);
    Register r2 = new Register(s2);
    Register r3 = new Register(s3);
    
    r1.enroll(subj2);
    r1.enroll(subj4);
    r1.enroll(subj6);
    System.out.println(r1.getStudent().getName() + " [" +r1.getStudent().getMajor() + "] have got a scholarship " +r1.getScholarship() + " Baht and have to pay " + r1.getTotalPayment() + " Baht\n");

    r2.enroll(subj1);
    r2.enroll(subj5);
    System.out.println(r2.getStudent().getName() + " [" +r2.getStudent().getMajor() + "] have got a scholarship " +r2.getScholarship() + " Baht and have to pay " + r2.getTotalPayment() + " Baht\n");
    
    r3.enroll(subj3);
    r3.enroll(subj4);
    r3.enroll(subj6);
    System.out.println(r3.getStudent().getName() + " [" +r3.getStudent().getMajor() + "] have got a scholarship " +r3.getScholarship() + " Baht and have to pay " + r3.getTotalPayment() + " Baht\n");
 }
}