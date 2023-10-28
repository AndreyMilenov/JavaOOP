package L08InterfacesAndAbstractionExercises.CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{
    public AddRemoveCollection() {
        super();
    }

    @Override
    public String remove() {
        return items.remove(items.size()-1);
    }

    @Override
    public int add(String text) {
        super.items.add(0,text);
        return 0;
    }
}
