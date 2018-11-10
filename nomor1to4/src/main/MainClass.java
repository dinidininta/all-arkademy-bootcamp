package main;

import java.util.ArrayList;
import java.util.List;
import nomor1.AvailableColorAndSize;
import nomor1.Produk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN8
 */
public class MainClass {
    
    public static void main(String[] args){
        // Nomor 1
        List<String> colors = new ArrayList<>();
        colors.add("M");
        colors.add("L");
        
        AvailableColorAndSize avcs = new AvailableColorAndSize("red", colors);
        
        Produk produk = new Produk("12341822", "basic t-shirt", 70000, avcs, false);
        produk.printJSON();
        
        System.out.println();
        
        // Nomor 2
        Nomor2 nomor2 = new Nomor2();
        System.out.println(nomor2.verify("qwert_QQ"));
        
        System.out.println();
        
        // Nomor 3
        Nomor3 nomor3 = new Nomor3();
        nomor3.segitigaAsli(7);
        
        System.out.println();
        
        // Nomor 4
        Nomor4 nomor4 = new Nomor4();
        System.out.println(nomor4.count_handshake(3, 2));

    }
    
}
