/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadso;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class ThreadSatu implements Runnable{
    int angka;
    String namaThread;
    
    public ThreadSatu(String nama){
        angka = 0;
        namaThread = nama;
    }
    
    public void run(){
        try {
            do {
                Thread.sleep(1000);
                System.out.println("di "+namaThread+", angka ke-"+angka);
                angka++;
            } while (angka<10);
        } catch (InterruptedException e) {
            System.out.println("error!");
        }
    }
}
