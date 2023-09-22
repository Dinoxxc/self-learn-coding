package Java.BeautySalon;

abstract class Membership {
    protected double serviceDiscount;
    
    public abstract double getProductDiscount();
    public abstract String getMembershipType();
    
    public double calculateServicePrice(double price) {
        return price - (price * serviceDiscount);
    }
}