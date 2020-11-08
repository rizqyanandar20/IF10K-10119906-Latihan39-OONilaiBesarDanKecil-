/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan39.oonilaibesardankecil;

import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * Kelas    : IF-10K
 * NIM      : 10119906
 */
public class IF10K10119906Latihan39OONilaiBesarDanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int jumlahMhs;

        nilai hasil = new nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======Program nilai terbesar dan nilai terkceil======");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jumlahMhs = scanner.nextInt();
        System.out.println();

        hasil.inputNilai(jumlahMhs);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jumlahMhs);

        System.out.println("Nilai Terbesar : " + hasil.nilaiTerbesar);
        System.out.println("Nilai Terkecil : " + hasil.nilaiTerkecil);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
}
   