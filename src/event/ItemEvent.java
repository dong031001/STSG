package event;

public abstract class ItemEvent extends AbstractEvent {
    private String itemID;

    public String getItemID() {
        return itemID;
    }

    public ItemEvent(String itemID) {
        this.itemID = itemID;
    }
}
