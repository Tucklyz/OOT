package lab801.ex2;

public class Email implements ToolBox{
    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(String fristName, String lastName, String domainName){
        
    }
    
    public void getInfo(){
        System.out.println("Email address: " + emailAddress);
        System.out.println("Username: " + userName);
        System.out.println("Domain Name: " + domainName);
    }

    public String toString(){
        return emailAddress;
    }             
}