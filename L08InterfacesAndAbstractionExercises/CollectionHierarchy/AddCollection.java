package L08InterfacesAndAbstractionExercises.CollectionHierarchy;

public class AddCollection extends Collection implements Addable{
    @Override
    public int add(String text) {
        super.items.add(text);
        return items.size()-1;
    }
}
