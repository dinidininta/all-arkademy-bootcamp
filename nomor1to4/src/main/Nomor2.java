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
public class Nomor2 {
    
    public String verify(String username){
        String firstPart = username.substring(0, 4);
        String lastPart = username.substring(6);
        int c = 0;
        
        if(username.length() < 8){
            return "username harus 8 karakter";
        }else{
            if(!isLowerCase(firstPart)){
                System.out.println("lima karakter pertama harus huruf kecil");
                c++;
            }

            if(username.charAt(5) != '_' && username.charAt(5) != '.'){
                System.out.println("karakter keenam harus _ atau .");
                c++;
            }

            if(!isUpperCase(lastPart)){
                System.out.println("dua karakter terakhir harus huruf besar");
                c++;
            }
        }
        
        if(c > 0){
            return "username invalid";
        }else{
            return "username valid";
        }
    }
    
    private boolean isLowerCase(String firstPart){
        for(char fp : firstPart.toCharArray()){
            if(Character.isUpperCase(fp) || !Character.isLetter(fp)){
                return false;
            }
        }
        return true;
    }
    
    private boolean isUpperCase(String lastPart){
        for(char lp : lastPart.toCharArray()){
                if(Character.isLowerCase(lp) || !Character.isLetter(lp)){
                    return false;
                }
        }
        
        return true;
    }
}
