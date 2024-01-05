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
public class MainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadSatu TM = new ThreadSatu("Thread Pertama");
        ThreadDua TM2 = new ThreadDua ("Thread Kedua");
        Thread thread1 = new Thread(TM);
        Thread thread2 = new Thread(TM2);
        thread1.start(); thread2.start();
    }
    
}
