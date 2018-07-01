package topic03.polymorphism.contractfirst.impl;


import topic03.polymorphism.contractfirst.util.Date;
import topic03.polymorphism.contractfirst.interfaces.Game;
import topic03.polymorphism.contractfirst.interfaces.Product;

public class GameImpl extends ProductImpl implements Game{
    
   //make a comparator class for Game that compares with 
    //respect to Date, then to the title
    
   private String title; 
   private Date date;

    public GameImpl(String id, double price, String title, Date date) {
        super(id, price);
        setTitle(title);
        setDate(date);
    }
    
    public GameImpl(GameImpl game) {
        this(game.getId(), game.getPrice(), game.title, game.date);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }
    
    @Override
    public void setId(String ID) {
        if (ID.startsWith("GM")&&ID.length()==12)
            super.setId(ID);
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
   @Override
    public String toString() {
        return String.format("\"id\" : %s\", "
                + "\"title\" : %s\","
                + "\"date\" : %s\","
                + "\"price\" : \"%.2f\"}\n", getId(),
                getTitle(), getDate(), getPrice());
    }
    
    
    @Override
    public int compareTo(Product product) {
        if (product instanceof Game){
            Game game = (Game)product;
             if(this.getPrice()>product.getPrice()){
                return 1;
                }else if(this.getPrice()<product.getPrice()){
                    return -1;
                }
            
            return this.getDate().compareTo(game.getDate());
        }
        return -9999;
    }
   
    
}
