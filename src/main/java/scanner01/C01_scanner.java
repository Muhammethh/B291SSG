package scanner01;

import java.util.Scanner;

public class C01_scanner {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütden iki numara giriniz");

        int a = input.nextInt(), b = input.nextInt();

        System.out.println("toplam" + a + b );
        System.out.println("çıkarma" + (a - b) );
        System.out.println("çarpma" + a * b );




    }
}
