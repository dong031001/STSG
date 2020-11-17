package event;

import java.util.ArrayList;
import java.util.List;

public class CraftItemEvent extends ItemEvent implements Countable {

    private int count;

    public CraftItemEvent(String itemID) {
        super(itemID);
        this.count = 1;
    }

    public CraftItemEvent(String itemID, int count) {
        super(itemID);
        this.count = count;
    }

    @Override
    public String toString() {
        return "工作台制作" + getItemID();
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"triumph:player_crafted_item\")");
        text.add(getCritName() + ".addItem(" + getItemID() + ")");
        if (count != 1) {
            text.add(getCritName() + ".setCount(" + getCount() + ")");
        }
        return text;
    }

    @Override
    public int getCount() {
        return count;
    }
}
