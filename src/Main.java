import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
        new Student(100, "Gosha"),
        new Student(30, "Mary"),
        new Student(55, "John"),
        new Student(44, "Jack"),
        new Student(96, "Jane")
        );
        students.sort(new SortingStudentsByGPA());
        System.out.println(students);
    }
}