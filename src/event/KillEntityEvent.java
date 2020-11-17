package event;

import java.util.ArrayList;
import java.util.List;

public class KillEntityEvent extends EntityEvent implements Countable {
    private int count;

    public KillEntityEvent(String entityID) {
        super(entityID);
        this.count = 1;
    }

    public KillEntityEvent(String entityID, int count) {
        super(entityID);
        this.count = count;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "击杀" + getEntityID();
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"minecraft:player_killed_entity\")");
        text.add(getCritName() + ".setEntityType(\"" + getEntityID() + "\")");
        if (count != 1) {
            text.add(getCritName() + ".setCount(" + getCount() + ")");
        }
        return text;
    }
}
