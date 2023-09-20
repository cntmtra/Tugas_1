/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_no3;

/**
 *
 * @author Labkom_M16
 */
import java.util.Scanner;
public class Tugas_No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int angka1, angka2, tambah, kurang, kali;
         float bagi;
         Scanner scanner = new Scanner (System.in);
         
         System.out.print("Masukkan 2 Angka : ");
         angka1 = scanner.nextInt ();
         angka2 = scanner.nextInt ();
         
         tambah = angka1 + angka2;
         kurang = angka1 - angka2;
         kali = angka1 * angka2;
         bagi = angka1 / angka2;
         
         System.out.println("Penjumlahan = " + tambah);
         System.out.println("Pengurangan = " + kurang);
         System.out.println("perkalian = " + kali);
         System.out.println("pembagian = " + bagi);
        }
}
