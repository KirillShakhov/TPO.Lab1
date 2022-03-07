package task3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Place {
    String name;
    List<Item> items = new ArrayList<>();

    public Place(String name) {
        this.name = name;
    }

    public Place(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
}
