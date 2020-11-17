package event;

import java.util.ArrayList;
import java.util.List;

public class RightClickBlockEvent extends BlockEvent {
    public RightClickBlockEvent(String blockID) {
        super(blockID);
    }

    @Override
    public String toString() {
        return "右击方块" + getBlockID();
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"triumph:right_click_block\")");
        text.add(getCritName() + ".setBlock(<" + getBlockID() + ">)");
        return text;
    }
}
