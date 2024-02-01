package week10.lab.lab1;
import java.util.Scanner;
public class Person implements UserToolBox{

    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private Email email;
    
    public Person(){
    }

    public Person(String fullName, Email email){
        this.fullName = fullName;
        this.email = email;
        setNamesOfUser(this.fullName);
    }

    public String getFullName() {
        return fullName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public Email getEmail() {
        return email;
    }

    public void setNamesOfUser(String fullName){
        this.fullName = fullName;
        String[] splitName = fullName.split(" ");
        firstName = splitName[0];
        middleName = splitName[1];
        lastName = splitName[2];
    }

    public void getInfo(){
        System.out.println("Full Name: " + fullName);
        System.out.println("Frist Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        email.getInfo();
    }

    public void verifyUser(Scanner sc){
        System.out.print("Enter the password of \"" + email + "\": ");
        String pass = sc.next();
        if(pass.equals(email.getPassword())){
            getInfo();
        }else{
            System.out.println("You don't have permission to access the account data!");
        }
    }
}