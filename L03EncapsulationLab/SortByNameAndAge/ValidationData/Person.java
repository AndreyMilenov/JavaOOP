package L03EncapsulationLab.ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstname, String lastName, int age, double salary) {
        setFirstName(firstname);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        ensureNameLength(firstname,"First");
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName,"last");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }



    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void ensureNameLength(String name, String messagePreFix) {
        if (name.length() < 3) {
            throw new IllegalStateException(messagePreFix + " name cannot be less than 3 symbols");
        }

    }

    public void increaseSalary(double bonus) {
        double bonusReduced = age < 30 ? bonus / 2 : bonus;

        double factor = 1.00 + bonusReduced / 100;

        salary = salary * factor;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", getFirstName(), getLastName(), getSalary());
    }
}
