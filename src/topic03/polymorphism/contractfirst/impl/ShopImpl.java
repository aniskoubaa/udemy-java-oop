package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.interfaces.Desktop;
import topic03.polymorphism.contractfirst.interfaces.Product;
import topic03.polymorphism.contractfirst.interfaces.Shop;
import topic03.polymorphism.contractfirst.interfaces.Game;
import topic03.polymorphism.contractfirst.interfaces.Laptop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShopImpl implements Shop{
    
    List<Product> products = new ArrayList<Product>(); 
    
    
    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public double getStockValue() {
        double value = 0.0;
        for (Product p: products){
            value = value + p.getPrice();
        }
        return value;
    }
    
    
    @Override
    public void saveToFile(String filename){
        
        File file = new File(filename);
        try {
            FileWriter fw = new FileWriter(file);
            
            for (Product p: products){
            
                if (p instanceof Game){
                    Game g = (Game)p;
                    fw.write("Game;");
                    fw.write(String.format("%s;%.2f;%s;%s\n",
                            g.getId(), g.getPrice(), 
                            g.getTitle(),g.getDate()));
                }


                if (p instanceof Laptop){
                    Laptop l = (Laptop)p;
                    fw.write("Laptop;");
                    fw.write(String.format("%s;%.2f;%s,%s\n",
                            l.getId(), l.getPrice(), l.getBrand(),l.getRam()));
                }

                if (p instanceof Desktop){
                    Desktop l = (Desktop)p;
                    fw.write("Desktop;");
                    fw.write(String.format("%s;%.2f;%s,%s\n",
                            l.getId(), l.getPrice(), l.getBrand(),l.getRam()));
                }
        }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ShopImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    //create a method called SortedGames that sort all games
    //in the products list according to the Comparator and return the
    // list of games sorted out
    
    public List<Game> sortedGames (){
        //get the list of games from products list
        List<Game> games = new ArrayList<Game>();
        for (Product product : this.getProducts()){
            
            //check if it is a Game
            if (product instanceof Game){
                
                //downcast product to a game
                Game game = (Game) product;

                //add this product into the games list
                games.add(game);
            }
        }
        
        //sort the list of games according to Comparator
        Collections.sort(games, new GameComparator());
        //return the list of games
        return games;
    }
    
    
}
