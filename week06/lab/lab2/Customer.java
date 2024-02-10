package week06.lab.lab2;

public class Customer {
    private String customerName;
    private String customerID;
    private String customerType;

    public Customer(String customerID, String customerName, String customerType){
        this.customerName = customerName ; 
        this.customerID = customerID ; 
        this.customerType = customerType ;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName ;            
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID ;     
    }

    public void setCustomerType(String customerType){
        this.customerType = customerType ;  
    }

    public String getCustomerName(){
        return customerName ;
    }

    public String getCustomerID(){
        return customerID ;
    }

    public String getCustomerType(){
        return customerType ;
    }
}