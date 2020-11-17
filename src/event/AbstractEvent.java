package event;

import java.util.List;
import java.util.Random;

public abstract class AbstractEvent {

    private String critName;

    abstract public String toString();

    abstract public List<String> serialize();

    protected String getCritName() {
        if (critName == null) {
            Random random = new Random();
            critName = this.getClass().getName().substring(7) + "_" + random.nextInt(1000000);
        }
        return critName;
    }
}
