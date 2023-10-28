package L08InterfacesAndAbstractionExercises.CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
   private final int maxSize ;
   protected List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
        this.maxSize = 100;
    }
}
