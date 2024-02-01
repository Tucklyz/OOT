package lab801.ex1 ;

public class Email implements ToolBox{
    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(String emailAddress){
        this.emailAddress = emailAddress;
        String[] sEmail = emailAddress.split("@");
        this.userName = sEmail[0];
        this.domainName = sEmail[1];
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