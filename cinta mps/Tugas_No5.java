/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_no5;

/**
 *
 * @author Labkom_M16
 */
import java.util.Scanner;
public class Tugas_No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner (System.in);
        int x,y;
        float tot, n, rata;
        System.out.print (" Banyaknya Data : ");
        y = Input.nextInt();
        tot = 0 ;
        x = 1;
        while (x<y) {
            System.out.print("Data ke-"+x+" : ");
            n= Input.nextFloat();
            tot += n;
            x++;
        }
        rata = tot/y;
        System.out.println("Rata-rata : "+rata);
        System.out.println("Total : "+tot);
    }
    
}
