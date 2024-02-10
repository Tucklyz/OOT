package week10.lab.lab1;

public class Email implements ToolBox{
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;

    public Email(String emailAddress, String password){
        this.emailAddress = emailAddress;
        String[] splitEmail = emailAddress.split("@");
        localPart = splitEmail[0];
        domainName = splitEmail[1];
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public String getLocalPart() {
        return localPart;
    }
    public String getDomainName() {
        return domainName;
    }
    public String getPassword() {
        return password;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setLocalPart(String localPart) {
        this.localPart = localPart;
    }
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return emailAddress;
    }

    public void getInfo(){
        System.out.println("Email: " + emailAddress);
        System.out.println("Local Part: " + localPart);
        System.out.println("Domain Name: " + domainName);
    }
}