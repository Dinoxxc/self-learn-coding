package Java.BeautySalon;

class NoMembership extends Membership {
    public NoMembership() {
        serviceDiscount = 0;
    }
    
    public double getProductDiscount() {
        return 0.15;
    }
    
    public String getMembershipType() {
        return "Tanpa keanggotaan";
    }
}
