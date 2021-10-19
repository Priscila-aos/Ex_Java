package jokengen;

import javax.management.InvalidAttributeValueException;

public class Player {

    private String name;
    private int totalPoints = 0;

    public Player(String name){
        this.name = name;
    }

    public void setName(String name) {
        if(verifyName(name)){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Hey! You need to choose a name");
        }
    }

    private boolean verifyName(String name){
        return name != null && name.length() != 0;
    }

    public String getName(){
        return this.name;
    }

    public void addPoints(int points){
        this.totalPoints += points;
    }

    public int getTotalPoints(){
        return this.totalPoints;
    }
}
