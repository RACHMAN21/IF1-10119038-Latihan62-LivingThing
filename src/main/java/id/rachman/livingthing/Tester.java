/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.livingthing;

/**
 *
 * @author
 * NAMA     : Rachman Aldiansyah
 * KELAS    : IF-1
 * NIM      : 10119038
 * Deskripsi Program : Program ini berisi kehidupan manusia dengan pendekatan object oriented
 *                     dan penerapan konsep pewarisan, abstract
 * 
 */

public class Tester {
    public static void main(String[] args) {
        LivingThing Rachman = new Human();
        Rachman.walk("Rachman Aldiansyah");
        Rachman.breath("Rachman Aldiansyah");
        Rachman.eat("Rachman Aldiansyah");
    }
}