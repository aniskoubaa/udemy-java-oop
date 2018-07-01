/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic03.polymorphism.contractfirst.impl;

import topic03.polymorphism.contractfirst.interfaces.Game;
import topic03.polymorphism.contractfirst.util.Date;
import java.util.Comparator;

//make a comparator class for Game that compares with 
//respect to Date, then to the title
    
public class GameComparator implements Comparator<Game>{

    @Override
    public int compare(Game game1, Game game2) {
        
        if (game1.getDate().compareTo(game2.getDate())!=0){
            Date date1 = game1.getDate();
            Date date2 = game2.getDate();
            int result = date1.compareTo(date2);
            return result;
        }
        return game1.getTitle().compareTo(game2.getTitle());
        
    }

    
    
}
