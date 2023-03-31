import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double tutar;
    double kdvOran1 = 0.18;
    double kdvOran2 = 0.08;
    double kdvTutar;
    double kdvliTutar; 
    System.out.println("Tutarı giriniz: ");
    tutar = scan.nextDouble();
    System.out.println("KDV'siz Fiyat = " + tutar);

    if(tutar<=1000){
        kdvTutar= tutar*kdvOran1;
        System.out.println("KDV Tutarı: "+ kdvTutar);
        kdvliTutar= tutar + kdvTutar;
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
    }else if(tutar>1000){
        kdvTutar= tutar*kdvOran2;
        System.out.println("KDV Tutarı: "+ kdvTutar);
        kdvliTutar= tutar + kdvTutar;
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
    }
    
    
    }
    
}