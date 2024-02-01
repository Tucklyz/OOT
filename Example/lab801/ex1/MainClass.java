package lab801.ex1 ;

public class MainClass {
    public static void main(String[] args) {
        User user1 = new User("Mark Elliot Zuckerberg", new Email("mark.z@meta.com"), "facebook");
        user1.getInfo();
        System.out.println();

        User user2 = new User("Steven Paul Jobs", new Email("jobs@apple.com"), "123Apple");
        user2.getInfo();
        System.out.println();
        
        User user3 = new User("William Henry Gates", new Email("bill.gates@microsoft.co.th"), "Windows11");
        user3.getInfo();
    }
}
