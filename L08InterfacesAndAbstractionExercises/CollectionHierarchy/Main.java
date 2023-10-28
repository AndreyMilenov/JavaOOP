package L08InterfacesAndAbstractionExercises.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myListe = new MyListImpl();

        String[] words = scanner.nextLine().split(" ");
        int numberRemoveOperation = Integer.parseInt(scanner.nextLine());
        performAddOperations(words,addCollection);
        performAddOperations(words,addRemoveCollection);
        performAddOperations(words,myListe);

        performRemoveOperations(numberRemoveOperation,addRemoveCollection);
        performRemoveOperations(numberRemoveOperation,myListe);


    }
    public static void performRemoveOperations(int counter,AddRemovable addRemovable) {
        for (int i = 0; i < counter; i++) {
            System.out.println(addRemovable.remove() + " ");
        }
        System.out.println();
    }

    public static void performAddOperations(String[] words, Addable addable) {
        for (String word : words) {
            System.out.println(addable.add(word) + " ");
        }
        System.out.println();
    }
}
