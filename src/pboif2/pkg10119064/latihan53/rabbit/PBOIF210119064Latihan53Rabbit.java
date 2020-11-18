/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan53.rabbit;

import model.Rabbit;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan nama, makanan,
 * jumlah kaki, warna, dan apakah kelinci itu vegetarian
 */
public class PBOIF210119064Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek rabbit
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        //output
        System.out.println("Hallo, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs.");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}
