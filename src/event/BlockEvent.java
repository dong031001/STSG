package event;

public abstract class BlockEvent extends AbstractEvent {
    private String blockID;

    public String getBlockID() {
        return blockID;
    }

    public BlockEvent(String blockID) {
        this.blockID = blockID;
    }
}
