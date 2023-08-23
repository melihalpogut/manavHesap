import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,armutKg,elmaKg,domatKg,muzKg,patKg,total;

        Scanner armInp = new Scanner(System.in);
        System.out.println("Armut kg giriniz :");
        armutKg = armInp.nextDouble();
        Scanner elmaInp = new Scanner(System.in);
        System.out.println("Elma kg giriniz :");
        elmaKg = elmaInp.nextDouble();
        Scanner domatInp = new Scanner(System.in);
        System.out.println("Domates kg giriniz :");
        domatKg = domatInp.nextDouble();
        Scanner muzInp = new Scanner(System.in);
        System.out.println("Muz kg giriniz :");
        muzKg = muzInp.nextDouble();
        Scanner patInp = new Scanner(System.in);
        System.out.println("Patlıcan kg giriniz :");
        patKg = patInp.nextDouble();

        total = (armut*armutKg) + (elma*elmaKg) + (domates*domatKg) + (muz*muzKg) + (patlican*patKg);
        System.out.print("Toplam tutar :" + total + "₺");
    }
}