package event;

import java.util.ArrayList;
import java.util.List;

public class LeftClickBlockEvent extends BlockEvent {
    public LeftClickBlockEvent(String blockID) {
        super(blockID);
    }

    @Override
    public String toString() {
        return "左键方块" + getBlockID();
    }

    @Override
    public List<String> serialize() {
        ArrayList<String> text = new ArrayList<>();
        text.add(getCritName() + " = addCriteria(\"" + getCritName() + "\", \"triumph:left_click_block\")");
        text.add(getCritName() + ".setBlock(<" + getBlockID() + ">)");
        return text;
    }
}
