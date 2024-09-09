/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author Acer E5
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika matematika = new Matematika();
        
        int hasilPertambahan = matematika.pertambahan(50, 78);
        int hasilPengurangan = matematika.pengurangan(20, 5);
        int hasilPerkalian = matematika.perkalian(14, 5);
        int hasilPembagian = matematika.pembagian(40, 6);
        
        System.out.println("Pertambahan : 50 + 78 = "+ hasilPertambahan);
        System.out.println("Pengurangan : 20 - 5 = "+ hasilPengurangan);
        System.out.println("Perkalian : 14 * 5 ="+ hasilPerkalian);
        System.out.println("Pembagian : 40 / 6 = "+ hasilPembagian);
    }
}
