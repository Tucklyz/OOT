package lecture5.ex4 ;
public class Car{
    private int licenseID;
    private String brand;
    private String colour;

    public Car(){
    }

    public Car(int licenseID, String brand, String colour) {
        this.licenseID = licenseID;
        this.brand = brand;
        this.colour = colour;
    }

    public void setLicenseID(int licenseID) {
        this.licenseID = licenseID;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLicenseID() {
        return licenseID;
    }
    public String getBrand() {
        return brand;
    }
    public String getColour() {
        return colour;
    }
}