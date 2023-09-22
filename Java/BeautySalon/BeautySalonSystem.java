package Java.BeautySalon;

import java.util.Scanner;

public class BeautySalonSystem {
    public static void main(String[] args) {
        double servicePrice = 5000; // Harga layanan tetap
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Salon Kecantikan!");
        System.out.println("Silakan pilih jenis keanggotaan Anda:");
        System.out.println("1. Premium");
        System.out.println("2. Gold");
        System.out.println("3. Silver");
        System.out.println("4. Tanpa keanggotaan");
        System.out.print("Pilihan Anda (1-4): ");
        
        int membership = scanner.nextInt();
        Membership member;
        
        switch (membership) {
            case 1:
                member = new PremiumMembership();
                break;
            case 2:
                member = new GoldMembership();
                break;
            case 3:
                member = new SilverMembership();
                break;
            default:
                member = new NoMembership();
                break;
        }
        
        System.out.print("Masukkan total harga produk: ");
        double productPrice = scanner.nextDouble();
        
        double discountedServicePrice = member.calculateServicePrice(servicePrice);
        double discountedProductPrice = productPrice - (productPrice * member.getProductDiscount());
        
        double totalPrice = discountedServicePrice + discountedProductPrice;
        
        System.out.println("--------------------------------------------------");
        System.out.println("Detail Tagihan:");
        System.out.println("Jenis Keanggotaan: " + member.getMembershipType());
        System.out.println("Harga Layanan: Rp" + servicePrice);
        System.out.println("Diskon Layanan: Rp" + (servicePrice - discountedServicePrice));
        System.out.println("Harga Produk: Rp" + productPrice);
        System.out.println("Diskon Produk: Rp" + (productPrice * member.getProductDiscount()));
        System.out.println("Total Harga: Rp" + totalPrice);
        System.out.println("--------------------------------------------------");
        
        scanner.close();
    }
}
