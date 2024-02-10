package week10.lab.lab2;
import java.util.Scanner;
public class Person implements UserToolBox{

    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private Email email;
    
    public Person(){
    }

    public Person(String fullName, String domain, String password){
        this.fullName = fullName;
        setNamesOfUser(fullName);
        this.email = new Email(fullName,domain, password) ;
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

    public void setEmail(Email email) {
        this.email = email;
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
        if(pass.equals(this.email.getPassword())){
            getInfo();
        }else{
            System.out.println("You don't have permission to access the account data!");
        }
    }
}