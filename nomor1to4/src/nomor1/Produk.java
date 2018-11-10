/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author WIN8
 */
public class Produk {
    
    private String itemID;
    private String itemName;
    private int price;
    private boolean freeShipping;
    private AvailableColorAndSize avcs;
    
    public Produk(String itemID, String itemName, int price, AvailableColorAndSize avcs, boolean freeShipping){
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemName = itemName;
        this.freeShipping = freeShipping;
        this.avcs = avcs;
    }
    
    public void setItemID(String itemID){
        this.itemID = itemID;
    }
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public void setFreeShipping(boolean freeShipping){
        this.freeShipping = freeShipping;
    }
    
    public void setColorAndSize(AvailableColorAndSize avcs){
        this.avcs = avcs;
    }
    
    public String getItemID(){
        return itemID;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getPrice(){
        return price;
    }
    
    public boolean getFreeShipping(){
        return freeShipping;
    }
    
    public AvailableColorAndSize getAVCS(){
        return avcs;
    }
    
    public void printJSON(){
        System.out.println("{ itemID : '" + itemID + "'," +
                            "\n itemName : '" + itemName + "'," +
                            "\n price : '" + price + "'," +
                            "\n availableColorAndSize : {\n" + 
                                    "\tcolor : '" + avcs.getColor() + "',\n" +
                                    "\tsizes : " + avcs.getSize() + "\n}" +
                            "\n freeShipping : '" + freeShipping + "'" + "}");
    }
    
}
