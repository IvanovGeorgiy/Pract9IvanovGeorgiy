public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.GPA - o.GPA;
    }
    @Override
    public String toString() {
        return "Student [GPA=" + GPA + " Name=" + name + "]";
    }
    int GPA;
    String name;
    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

}
