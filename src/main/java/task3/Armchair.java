package task3;

import lombok.Data;

import java.awt.*;

@Data
public class Armchair implements Item{
    private String name;
    private Double endurance = 100.0;
    private Color color;
    private Creature creatureOnArmchair;

    public Armchair(Color color) {
        this.color = color;
    }

    public void flopDown(Creature creature){
        if(endurance>0){
            if(endurance-(creature.getWeight()/2)>0){
                endurance -= creature.getWeight()/10;
                System.out.println(creature.getName()+" плюхнулся, а " + getName() + " лишь жалобно скрипнуло");
            }
            else {
                endurance = 0.0;
                System.out.println(creature.getName()+" плюхнулся, а " + getName() + " сломалось");
            }
        }
        else System.out.println("Кресло сломано");
    }
}
