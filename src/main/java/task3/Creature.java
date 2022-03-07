package task3;

import lombok.Data;

@Data
public class Creature {
    private String name;
    private Colors color;
    private Double weight;
    private Place currentLocation;
    private Mood mood = Mood.CALM;

    public Creature(String name, Colors color, Double weight, Place currentLocation) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.currentLocation = currentLocation;
    }

    public void move(Place place){
        this.currentLocation = place;
    }
}
