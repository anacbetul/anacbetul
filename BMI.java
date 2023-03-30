package BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        double kg = 0;
        double height = 0;
        double bmi=0;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height= scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kg= scan.nextDouble();

        bmi= (kg/ (height*height));

        System.out.println("Vücut Kitle İndeksiniz : "+bmi);



    }
}
