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
 * Deskripsi Program : Program ini berisi class abstract LivigThing
 * 
 */

public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas."));
    }
    
    public void eat(String nama) {
        System.out.println(nama.concat(" Makan."));
    }
}