/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_no1;

/**
 *
 * @author Labkom_M16
 */
import java.util.Scanner;

public class Tugas_no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        int x, y;
        double luas;
        
        System.out.print("Masukkan Alas : ");
        x=input.nextInt();
        System.out.print("Masukkan Tinggi : ");
        y=input.nextInt();
        
        luas=0.5*x*y;
        System.out.println("Luas Segitiga : "+luas);
    }
    
}
