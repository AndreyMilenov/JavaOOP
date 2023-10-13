package L01WorkingWithAbstractionLab.StudentSystem;


import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }



    public String parseCommand(String[] args) {

        String command = args[0];

        switch (command) {
            case "Create":
                String name = args[1];
                int age = Integer.parseInt(args[2]);
                double grade = Double.parseDouble(args[3]);
                createAndRegisterStudent(name, age, grade);
                return null;

            case "Show":
                String nameToShow = args[1];
                return getStudentInfo(nameToShow);
            case "Exit":
                return command;

            default:
                throw new IllegalArgumentException("Unknown command " + command);
        }
    }

    private String getStudentInfo(String name) {
        Student student = this.students.get(name);

        if (name == null) {
            throw new IllegalArgumentException("No student whit name " + name.toString());
        }

         return studentInfoFormatter.getFormatted(student);
    }

    private void createAndRegisterStudent(String name, int age, double grade) {
        this.students.putIfAbsent(name, new Student(name, age, grade));
    }
}
