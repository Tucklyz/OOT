package week06.lab.lab2;

public class Order {
    private Customer customer;
    private Book[] books = new Book[5];
    private int bookCount = 0;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void cart(Book book) {
        if (bookCount < 5) {
            books[bookCount] = book;
            bookCount++;
            System.out.println(customer.getCustomerName() + " ordered " + book.getBookName() + ": " + book.getBookPrice() + " Baht.");
        }
    }

    public double discount() {
        switch (customer.getCustomerType()) {
            case "Diamond":
                return 0.2;
            case "Gold":
                return 0.1;
            case "Student":
                return Math.min(0.3, 300.0 / calculateTotalPrice());
            default:
                return 0.0;
        }
    }

    private double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < bookCount; i++) {
            totalPrice += books[i].getBookPrice();
        }
        return totalPrice ;
    }

    public String customers(){
        String cus = customer.getCustomerName() + " [" + customer.getCustomerType() +"]";
        return cus ;
    }

    public double calculateDiscountAmount() {
        double discountAmount = calculateTotalPrice() * discount();
        return discountAmount ;
    }

    public double calculateFinalPrice() {
        double finalPrice = calculateTotalPrice() - calculateDiscountAmount();
        return finalPrice;
    }
}