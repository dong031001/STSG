package event;

public abstract class EntityEvent extends AbstractEvent {
    private String entityID;

    public String getEntityID() {
        return entityID;
    }

    public EntityEvent(String entityID) {
        this.entityID = entityID;
    }
}
