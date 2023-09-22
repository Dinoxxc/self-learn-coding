package Java.BeautySalon;

class PremiumMembership extends Membership {
    public PremiumMembership() {
        serviceDiscount = 0.25;
    }
    
    public double getProductDiscount() {
        return 0.15;
    }
    
    public String getMembershipType() {
        return "Premium";
    }
}