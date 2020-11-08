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
 */
public class nilai {
    public int nilai[] = new int[100];
    public int nilaiTerbesar, nilaiTerkecil;

    public void inputNilai(int jumlahMhs) {
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 1; i <= jumlahMhs; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scanner.nextInt();
        }
    }

    public void tampilNilai(int jumlahMhs) {
        int i;
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (i = 1; i <= jumlahMhs; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaiTerbesarTerkecil(int jumlahMhs) {
        int i;

        nilaiTerkecil = nilai[1];
        nilaiTerbesar = nilai[1];

        for (i = 1; i <= jumlahMhs; i++) {
            if (nilai[i] > nilaiTerbesar) {
                nilaiTerbesar = nilai[i];
            } else if (nilai[i] < nilaiTerkecil) {
                nilaiTerkecil = nilai[i];
            }
        }
    }
}

