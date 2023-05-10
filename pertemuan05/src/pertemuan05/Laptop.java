/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan05;

/**
 *
 * @author asus
 */
public class Laptop {
    String merek;
    String tipe;
    String warna;
    String CPU;
    int ram;
    int penyimpanan;
    
    void infoSpec(){
        System.out.println("======================Info Spec===================");
        System.out.println("Nama Laptop \t\t: "+merek);
        System.out.println("Warna Laptop \t\t: "+tipe);
        System.out.println("Warna Laptop \t\t: "+warna);
        System.out.println("CPU Laptop \t\t: "+CPU);
        System.out.println("Ram Laptop \t\t: "+ram+" GB");
        System.out.println("Penyimpanan Laptop \t: "+penyimpanan+ "GB");
        System.out.println("======================Info Spec===================");
    }    
    
    void caraPenggunaan(){
        System.out.println("Cara Penggunaan Laptop");
        System.out.println("1. Buka Laptop terlebih dahulu");
        System.out.println("2. Tekan tombol power");
        System.out.println("3. Tunggu hingga terlihat wallpaper");
        System.out.println("4. Gunakan laptop sesuai pekerjaan");      
    }
}
