package week06.lab.lab2;

public class Book {
    private String bookName;
    private String bookID;
    private double bookPrice;

    public Book(String bookID, String bookName, double bookPrice){
        this.bookName = bookName ; 
        this.bookID = bookID ; 
        this.bookPrice = bookPrice ;
    }

    public void setBookName(String bookName){
        this.bookName = bookName ;            
    }

    public void setBookID(String bookID){
        this.bookID = bookID ;     
    }

    public void setBookPrice(double bookPrice){
        this.bookPrice = bookPrice ;  
    }

    public String getBookName(){
        return bookName ;
    }

    public String getBookID(){
        return bookID ;
    }

    public double getBookPrice(){
        return bookPrice ;
    }
}