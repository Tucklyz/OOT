package week10.lab.lab2;

public class Email implements ToolBox{
    private String emailAddress;
    private StringBuilder localPart;
    private String domainName;
    private String password;
 
    public Email(String fullName, String domain, String password){
        String[] splitName = fullName.split(" "); 
        localPart.append(splitName[0].toLowerCase());
        localPart.append(".");
        localPart.append(splitName[2].toLowerCase().charAt(0));
        this.domainName = domain + ".com";
        this.emailAddress = localPart + "@" + this.domainName;
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