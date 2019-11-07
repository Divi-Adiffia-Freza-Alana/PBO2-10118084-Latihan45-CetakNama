/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan cetak nama

 */
public class PBO210118084Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("===Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda :");
        printer.setNama(scanner.next());
        System.out.print("Mau Cetak nama berapa kali? :");
        printer.setJmlCetak(scanner.nextInt());
        printer.cetak();
    }
    
}
