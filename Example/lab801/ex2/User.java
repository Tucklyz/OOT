package lab801.ex2;
    import java.util.Scanner;
    public class User implements UserToolBox{
        private String fristName;
        private String middleName;
        private String lastName;
        private Email email;
        private String password;

        

        public User(String name, Email email, String password){
            this.email = email;
            this.password = password;
            String[] sName = name.split(" ");
            this.fristName = sName[0];
            this.middleName = sName[1];
            this.lastName = sName[2];
        }

        public void setName(String name){
            String[] sName = name.split(" ");
            this.fristName = sName[0];
            this.middleName = sName[1];
            this.lastName = sName[2];
        }

        public void getInfo(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the password of \"" + email + "\" : ");
            String pass = sc.next();
            if (pass.equals(password)){
                System.out.println("Frist name: "+ fristName);
                System.out.println("Middle name: "+ middleName);
                System.out.println("Last name: "+ lastName);
                email.getInfo();
            }else{
                System.out.println("You don't have permission to access this information!");
            }
        }
    }