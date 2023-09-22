package Java.BeautySalon;

class GoldMembership extends Membership {
    public GoldMembership() {
        serviceDiscount = 0.15;
    }
    
    public double getProductDiscount() {
        return 0.15;
    }
    
    public String getMembershipType() {
        return "Gold";
    }
}