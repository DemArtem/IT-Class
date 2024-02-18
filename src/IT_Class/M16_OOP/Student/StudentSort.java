package IT_Class.M16_OOP.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы
 */
public class StudentSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("3Иван", "1Иванов", 2));
        students.add(new Student("2Николай", "2Петров", 3));
        students.add(new Student("1Петр", "3Сидоров", 1));

        Collections.sort(students);

        //сортировка по Фамилии
        System.out.println("сортировка по Фамилии:");
        for (Student student:students)
            System.out.println(student.toString());
        System.out.println("");

        //сравнение индексов по Фамилии
        Student student1 = new Student("Иван", "Иванов", 1);
        Student student2 = new Student("Николай", "Петров", 2);
        System.out.println("разница индексов в Фамилии: " + student1.compareTo(student2));
        System.out.println("");

        //сортировка по Имени
        System.out.println("сортировка по Имени:");
        Comparator<Student> compName = Comparator.comparing(student -> student.getName());
        Collections.sort(students, compName);
        for (Student student: students)
            System.out.println(student.toString());
        System.out.println("");

        //сортировка по Курсу
        System.out.println("сортировка по Курсу:");
        Comparator<Student> compGrade = Comparator.comparing(student -> student.getGrade());
        Collections.sort(students, compGrade);
        for (Student student: students)
            System.out.println(student.toString());
        System.out.println("");

        //сортировка по Имени и Фамилии
        System.out.println("сортировка по Имени и Фамилии:");
        Comparator<Student> compNameSurname = Comparator.comparing((Student s)->s.getName())
                .thenComparing(s->s.getSurname()); //!
        Collections.sort(students, compNameSurname);
        for (Student student: students)
            System.out.println(student.toString());
    }

}

