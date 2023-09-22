package Java;

public class Product {
    private int mProductID;
    private String mProductName;
    private double mPrice;
    private int mQuantity;

    public Product(int productID, String productName, double price, int quantity) {
        setProduct(productID, productName, price, quantity);
    }

    public void setProduct(int productID, String productName, double price, int quantity) {
        mProductID = productID;
        mProductName = productName;
        mPrice = price;
        mQuantity = quantity;
    }

    public int getProductID() {
        return mProductID;
    }

    public String getProductName() {
        return mProductName;
    }

    public double getPrice() {
        return mPrice;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public double getTotalPrice() {
        return mPrice * mQuantity;
    }

    public void print() {
        System.out.printf("%-10d%-20s%-10.2f%-10d\n", mProductID, mProductName, mPrice, mQuantity);
    }

    public static void main(String[] args) {
        Product tBarang = new Product(0, "Aqua Botol", 5000, 3);
        System.out.printf("%-10s%-20s%-10s%-10s\n", "ID Produk", "Nama Produk", "Harga", "Jumlah");
        tBarang.print();

    }
}





