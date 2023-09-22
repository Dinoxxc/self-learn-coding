package Java.BeautySalon;

class SilverMembership extends Membership {
    public SilverMembership() {
        serviceDiscount = 0.10;
    }
    
    public double getProductDiscount() {
        return 0.15;
    }
    
    public String getMembershipType() {
        return "Silver";
    }
}