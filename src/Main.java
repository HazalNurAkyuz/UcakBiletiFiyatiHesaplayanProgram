import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas , tip;
        System.out.print("Gideceginiz Mesafeyi Giriniz :");
        km = input.nextInt();
        System.out.print("Yolcunun Yasini Giriniz :");
        yas = input.nextInt();
        System.out.print("\nYolculuk Tipini Seciniz");
        System.out.println("\n1-Tek YOn Gidis \n2-Gidis-Donus");
        System.out.print("Seciminiz :");
        tip = input.nextInt();

        double normalFiyat, yasIndirimi, tipIndirimi;

        if(km > 0 && yas > 0 && (tip==1 || tip==2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.50;
                normalFiyat = normalFiyat - yasIndirimi;
            }else if (yas>=12 && yas<=24 ) {
                yasIndirimi = normalFiyat * 0.10;
                normalFiyat = normalFiyat - yasIndirimi;
            } else if (yas >= 65) {
                yasIndirimi = normalFiyat * 0.20;
                normalFiyat = normalFiyat - yasIndirimi;
            }else {
                yasIndirimi = 0;
            }
            if (tip==2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = normalFiyat - tipIndirimi;

            }
            if(normalFiyat>0) {
                System.out.println("Bilet Tutarİ :" + normalFiyat);
            }

        }

    }
}