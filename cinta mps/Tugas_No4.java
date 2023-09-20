/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_no4;

/**
 *
 * @author Labkom_M16
 */
public class Tugas_No4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan Genap");
        for (int x = 0; x<15; x++){
            if (x % 2 == 0){
                System.out.print(" " + x);
            }
        }
        System.out.println();
        System.out.println("Bilangan Ganjil");
        for(int x=0; x<15; x++){
            if(x % 2 != 0){
                System.out.print(" " +x);
            }
        }
        
        
    }
    
}
