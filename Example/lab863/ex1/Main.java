package lab863.ex1;

public class Main{
    public static void main(String[] args){
        Student[] s = new Student[3]; 
        s[0] = new Student("John", "A3B4C2D1");
        s[1] = new Student("George", "B3B4B3");
        s[2] = new Student("Jeck", "B4C2I4");

        for(Student students : s){
            students.display();
        }
    }
}