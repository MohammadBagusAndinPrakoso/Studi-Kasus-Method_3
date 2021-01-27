/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studiKasus;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class Static {
    
    
    static void pengenalan(){
        Scanner input = new Scanner(System.in); //Menambahkan Scanner
        //Deklarasi variabel
        String nama, alamat, sekolah;
        int usia;
        
        //Mengisi data user
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Sekolah : ");
        sekolah = input.nextLine();
        System.out.print("Masukkan Usia : ");
        usia = input.nextInt();
        
        //Menampilkan data user
    }
    
    static void hitung(){
        Scanner input = new Scanner(System.in); //Menambahkan Scanner
        
        //Deklarasi variabel
        String suhu[] = {"x", "Celsius -> Fahrenheit", "Celcius -> Kelvin", "Celcius -> Reamour"};
        double c, f, k, r;
        int pilihan;
        
        //Menggunakan perulangan untuk menampilkan isi data Array
        for(int i=1; i<suhu.length; i++){
            System.out.println(i + ". " +suhu[i]);
        }
        
        //User memilih jenis konversi suhu
        System.out.println("--------------------------");
        System.out.print("Masukkan Jenis Konversi : ");
        pilihan = input.nextInt();
        System.out.println("Konversi yang di pilih : " +suhu[pilihan]);
        System.out.println("--------------------------");
        
        //Menggunakan percabangan Switch Case dan menjalankan program sesuai inputan user
        switch(pilihan){
            case 1 :
                System.out.print("Masukkan suhu Celcius : ");
                c = input.nextInt();
                System.out.println("Suhu " +c+ " Celcius = " +((c * 9/5)+32)+ " F");
                break;
            case 2 :
                System.out.print("Masukkan suhu Celcius : ");
                c = input.nextInt();
                System.out.println("Suhu " +c+ " Celcius = " +(c+273.15)+ " K");
                break;
            case 3 :
                System.out.print("Masukkan suhu Celcius : ");
                c = input.nextInt();
                System.out.println("Suhu " +c+ " Celcius = " +(c * 4/5)+ " R");
                break;
        }
    }
}
