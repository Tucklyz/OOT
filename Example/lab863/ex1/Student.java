package lab863.ex1;

public class Student{
    private String name;
    private int numSubject = 0;
    private double gpa = 0.00;

    public Student(String name, String subject){
        this.name = name;
        calculateGPA(subject);
    }

    public void calculateGPA(String subject){
        int i,num = 0,sum = 0;
        for(i = 0 ; i < subject.length() ; i+=2){
            num = subject.charAt(i+1)-'0';
            numSubject += num;
            switch(subject.charAt(i)){
                case 'A':
                    sum += (4*num);
                    break;
                case 'B':
                    sum += (3*num);
                    break;
                case 'C':
                    sum += (2*num);
                    break;
                case 'D':
                    sum += (1*num);
                    break;
                default:
                    sum = -1;
                    break;
            }
        }
        gpa = sum*1.0 / numSubject;
        numSubject = i/2;
    }

    public void display(){
        System.out.println(name + " registered " + numSubject + " subjects");
        if(gpa >= 0){
            System.out.println(name + " has got GPA = " + gpa);
        }else{
            System.out.println(name + " has got GPA = incomplete");
        }
    }
}