package lecture5.ex4 ;
public class Owner{
    private String name;
    private String gender;
    private int age;

    public Owner(){
    }

    public Owner(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name){
        this.name = name ;
    }
    public void setGender(String gender){
        this.gender = gender ;
    }
    public void setage(int age){
        this.age = age ;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}