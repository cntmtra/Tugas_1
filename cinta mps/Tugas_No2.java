/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_no2;

/**
 *
 * @author Labkom_M16
 */
import java.util.Scanner;

public class Tugas_No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
       
    System.out.println("##  biodata menggunakan program java ##");
    System.out.println("---------------------------------------");
    System.out.println();
     
    String nama;
    int usia;
    double tinggi_badan;
  
    System.out.print("Nama mahasiswa: ");
    nama = input.nextLine();
     
    System.out.print("Usia: ");
    usia = input.nextInt();
     
    System.out.print("Tinggi Badan: ");
    tinggi_badan = input.nextDouble();
  
     
    System.out.println();
     
    System.out.println("# BIODATA MAHASISWA #");
    System.out.println("*********************");
    System.out.println("Nama: "      + nama);
    System.out.println("Usia: "       + usia);
    System.out.println("Tinggi Badan: "  + tinggi_badan);
    
    }
    
}
