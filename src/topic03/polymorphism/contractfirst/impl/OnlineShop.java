package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.util.Date;
import topic03.polymorphism.contractfirst.interfaces.Shop;
import java.util.ArrayList;

public class OnlineShop {    
    public static void main(String [] args){
        
        Shop shop = new ShopImpl();
        
        shop.addProduct(new GameImpl("GM1234567897", 1000.0, "FIFA2018", new Date(1,2,2018)));
        shop.addProduct(new GameImpl("GM9874567555", 800.0, "FIFA2017", new Date(1,3,2017)));
        shop.addProduct(new LaptopImpl("LP9854567354", 2500.00, "HP", 16));
        shop.addProduct(new LaptopImpl("LP7845845845", 3500.00, "MAC", 16));
        shop.addProduct(new DesktopImpl("DK7341524214", 4560.00, "DELL", 16));
        shop.addProduct(new GameImpl("GM1234567435", 700.0, "FIFA2016", new Date(1,2,2016)));
        shop.addProduct(new GameImpl("GM9874567111", 600.0, "FIFA2015", new Date(1,3,2015)));
        
        
        System.out.println("Stock Value: "+ shop.getStockValue());
        shop.saveToFile("shop.txt");
        
        System.out.println("List of Games Sorted Out");
        System.out.println(shop.sortedGames());
        
        
    }
    
}
