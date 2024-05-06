package _Java.IT_Class.M16_OOP.Student;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int grade;

    public Student(String name, String surname, int grade) {

        this.name
                = name;
        this.surname = surname;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }

    //сортировка по фамилии
    @Override
    public int compareTo(Student o) {
        return this.surname.compareTo(o.surname);
    }
}
