package event;

import java.util.ArrayList;
import java.util.List;

public class HarvestItemEvent extends ItemEvent implements Countable {

    private int count;

    public HarvestItemEvent(String itemID) {
        super(itemID);
        this.count = 1;
    }

    public HarvestItemEvent(String itemID, int count) {
        super(itemID);
        this.count = count;
    }

    @Override
    public String toString() {
        return "获取物品" + getItemID() + count + "个";
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"minecraft:inventory_changed\")");
        text.add(getCritName() + ".addItem(" + getItemID() + ")");
        if (count != 1) {
            text.add(getCritName() + ".setCount(" + getCount() + ")");
        }
        return text;
    }
}
