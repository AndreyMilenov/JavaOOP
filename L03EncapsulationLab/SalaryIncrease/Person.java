package L03EncapsulationLab.SalaryIncrease;

public class Person {
    private String firstname;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstname, String lastName, int age,double salary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void increaseSalary(double bonus) {
        double bonusReduced = age < 30 ? bonus / 2 : bonus;

        double factor = 1.00 + bonusReduced / 100;

        salary = salary * factor;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",getFirstName(),getLastName(),getSalary());
    }
}
