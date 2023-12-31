package L08InterfacesAndAbstractionExercises.MultipleImplementation;

public class Citizen implements Identifiable,Birthable,Person{
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public Citizen() {
        super();
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }
}
