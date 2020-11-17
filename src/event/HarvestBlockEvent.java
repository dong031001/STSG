package event;

import java.util.ArrayList;
import java.util.List;

public class HarvestBlockEvent extends BlockEvent implements Countable {

    private int count;

    public HarvestBlockEvent(String blockID) {
        super(blockID);
    }

    public HarvestBlockEvent(String blockID, int count) {
        super(blockID);
        this.count = count;
    }

    @Override
    public String toString() {
        return "破坏方块" + getBlockID();
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"triumph:player_destroy_block\")");
        text.add(getCritName() + ".setBlock(<" + getBlockID() + ">)");
        if (getCount() != 1) {
            text.add(getCritName() + ".setCount(" + getCount() + ")");
        }
        return text;
    }

    @Override
    public int getCount() {
        return count;
    }
}
