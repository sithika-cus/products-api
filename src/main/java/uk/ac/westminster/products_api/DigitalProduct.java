package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

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
}
