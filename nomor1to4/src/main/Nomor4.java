/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author WIN8
 */
public class Nomor4 {
    
    public int count_handshake(int n, int r){
        
        return faktorial(n)/(faktorial(r) * faktorial(n-r));
    
    }
    
    private int faktorial(int n){
        int result = n;
        
        for(int i=n-1; i>0; i--){
            result = result * i;
        }
        return result;
    }
    
}
