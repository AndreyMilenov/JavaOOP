package L05InheritanceLab.StackOfStrings;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }
    public void push(String element) {
        data.add(0,element);
    }
    public String pop() {
       String element =  data.get(0);
       data.remove(0);
       return element;
    }
    public String peek() {
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
