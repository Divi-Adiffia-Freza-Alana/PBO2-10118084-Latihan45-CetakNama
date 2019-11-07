/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Freza
 */
public class Printer {
    Scanner scanner = new Scanner(System.in);
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    void cetak(String nama){
        this.nama=nama;
        
    }
    void cetak(){
        for(int i = 1; i <= jmlCetak;i++ ){
            System.out.println(+i+"." +nama);
        }
    }
}
