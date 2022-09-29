package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do{
            System.out.println();
            System.out.println("Pilih menu kategori bangun ruang");
            System.out.println();
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Keluar");
            menu = input.nextInt();

            switch (menu){
                case 1 -> {
                    System.out.println("Menghitung luas permukaan dan volume pada balok");

                    System.out.println("Masukan panjang balok : ");
                    int p = input.nextInt();
                    System.out.println("Masukan lebar balok : ");
                    int l = input.nextInt();
                    System.out.println("Masukan tinggi balok :");
                    int t = input.nextInt();

                    //rumus menghitung luas permukaan balok
                    //2.(panjang.lebar)+(lebar.tinggi)+(panjang.tinggi)
                    int luasPermukaanBalok = 2*((p*l)+(p*t)+(l*t));
                    int volumeBalok = p*l*t;

                    System.out.println("Jadi Luas Permukaan Balok adalah : " + luasPermukaanBalok);
                    System.out.println("Jadi volume Balok adalah : " + volumeBalok );


                }
                case 2 -> {
                    System.out.println("Menghitung luas permukaan dan volume pada bola");

                    System.out.println("masukan jari-jari lingkaran");
//                    int d = ;
                    int j = input.nextInt();
                    double phi = 22/7;

                    //rumus menghitung luas permukaan bola
                    // 4.phi.r2
                    double luasPermukaanBola = 4*phi*(j*j);

                    //rumus menghitung volume bola
                    // (4/3).phi.r3
                    double volumeBola = (4/3)*phi*(j*j*j);

                    System.out.println("Jadi Luas Permukaan Bola adalah : " + luasPermukaanBola );
                    System.out.println("Jadi volume Bola adalah : " + volumeBola );

                }
                default -> {}
            }

        }while (menu != 0);
        input.close();





















    }
}
