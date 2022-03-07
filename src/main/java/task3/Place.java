package task3;

import lombok.Data;

import java.util.List;

@Data
public class Place {
    String name;
    List<Item> items;

    public Place(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }
}
