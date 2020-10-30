/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class IF10K10119906Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;

        System.out.println("===Program Nilai Terbesar dan "
                + "Terkecil Nilai Mahasiswa===");
        System.out.print("Masukkan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int [nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            
        }
        int max = 0;
        for (int val : nilai) {
            if ( max < val){
                max = val;
            }
    }
        System.out.print("\nNilai Terbesar adalah " + max);
        
        int min = nilai[0];
        for (int val : nilai) {
            if(val < min) { 
                min = val;
            }
    
        }
        System.out.println("\nNilai Terkecil adalah " + min);
        System.out.println("\nPetugas : " + Nama);
    }
    
}
