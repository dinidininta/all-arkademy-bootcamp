/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

import java.util.List;

/**
 *
 * @author WIN8
 */
public class AvailableColorAndSize {
    private String color;
    private List<String> sizes;
    
    public AvailableColorAndSize(String color, List<String> sizes){
        this.color = color;
        this.sizes = sizes;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setSizes(List<String> sizes){
        this.sizes = sizes;
    }
    
    public String getColor(){
        return color;
    }
    
    public List<String> getSizes(){
        return sizes;
    }
    
    public String getSize(){
        return this.sizes.toString();
    }
    
}
