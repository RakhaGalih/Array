/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author aaaaa
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 65;
        double ratarata = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            ratarata += nilai[i];
        }
        ratarata /= nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
MemanggilArray();
    }
    
    public static void MemanggilArray(){
    
 int [] jumlahhari;
 jumlahhari = new int [7];
jumlahhari[0] = 31;
jumlahhari[1] = 28;
jumlahhari[2] = 31;
 jumlahhari[3] = 30;
jumlahhari[4] = 31;
 jumlahhari[5] = 30;
jumlahhari[6] = 31;
System.out.println("Bulan Januari memiliki " + jumlahhari[2]+ " hari.");
}
}


