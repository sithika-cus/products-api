package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    // 1. No-arg constructor (Jackson needs this)
    public DigitalProduct() {
    }

    // 2. Full constructor
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first line! Calls the parent (Product) constructor.
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // 3. Getters
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | Download: " + getDownloadUrl();
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
