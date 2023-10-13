package L01WorkingWithAbstractionLab.StudentSystem;

public class studentInfoFormatter {

    public static String getFormatted(Student student) {
        if (student != null) {
            return String.format("%s is %s years old. %s"
                    , student.getName(), student.getAge(), getCommentary(student.getGrade()));
        } else {
            return "";
        }


    }
    private static String getCommentary(double grade) {
        if (grade >= 5.00) {
            return "Excellent student.";
        } else if (grade < 5.00 && grade >= 3.50) {
            return  "Average student.";
        }
          return   "Very nice person.";

    }
}
