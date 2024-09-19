package scanner01;

import java.util.Scanner;

public class C03_scanner {

    public static void main(String[] args) {
        //kullanicidan tek bir karakter alip yazdiriniz

        //Scanner input = new Scanner(System.in);
        //System.out.println("Lütfen tek bir karakter giriniz");
        //char s = input.next().charAt(0);

        //System.out.println(s);


        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz:Ahmet Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = input.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = input.nextLine();




    }
}
