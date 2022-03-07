package task3;

import lombok.Data;


@Data
public class Armchair implements Item{
    private String name = "Кресло";
    private Double endurance = 100.0;
    private Colors color;
    private Creature creatureOnArmchair;

    public Armchair(Colors color) {
        this.color = color;
    }

    public void flopDown(Creature creature){
        if (creatureOnArmchair == null || creatureOnArmchair == creature) {
            if (endurance > 0) {
                if (endurance - (creature.getWeight() / 2) > 0) {
                    endurance -= creature.getWeight() / 10;
                    setCreatureOnArmchair(creature);
                    System.out.println(creature.getName() + " плюхнулся, а " + getName() + " лишь жалобно скрипнуло");
                } else {
                    endurance = 0.0;
                    setCreatureOnArmchair(null);
                    System.out.println(creature.getName() + " плюхнулся, а " + getName() + " сломалось");
                }
            } else System.out.println("Кресло сломано");
        }
        else System.out.println("В " + getName() +  " кто-то есть");
    }
}
