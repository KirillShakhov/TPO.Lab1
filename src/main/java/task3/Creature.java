package task3;

import lombok.Data;

@Data
public class Creature {
    private String name;
    private Color color;
    private Double weight;
    private Place currentLocation;
    private Mood mood = Mood.CALM;



    public void move(Place place){
        this.currentLocation = place;
    }
}
