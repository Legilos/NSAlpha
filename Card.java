/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NSalpha;

import java.awt.Image;

/**
 *
 * @author Bruce
 */
public class Card {

    public String title;
    public String description;
    public String type;
    public int points;
    Image cardFace;

    public Card(String x, String y, String z, int i) {
        title = x;
        description = y;
        type = z;
        points = i;
    }

    public void setImage(Image x) {
        cardFace = x;
    }
    public Image getImage(){
        return cardFace;
    }
    
    public void setTitle(String x) {
        title = x;
    }

    public void setDescription(String x) {
        description = x;
    }

    public void setType(String x) {
        type = x;
    }

    public void setPoints(int x) {
        points = x;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPoints() {
        return points;
    }

    public void displayCard() {
        System.out.println(title + "\n" + description + "\n" + type + "\n" + points + "\n=======================\n");
    }
    
    public String getCardInfo(){
        return title + "\n" + description + "\n" + type + "\n" + points + "\n=======================\n";
    }

}
