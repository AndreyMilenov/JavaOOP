package L08InterfacesAndAbstractionExercises.CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{
    public MyListImpl() {
        super();
    }

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int add(String text) {
        super.items.add(0,text);
        return 0;
    }

    @Override
    public int getUsed() {
        return items.size();
    }
}
