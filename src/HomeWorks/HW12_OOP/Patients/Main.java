package HomeWorks.HW12_OOP.Patients;

import HomeWorks.HW12_OOP.Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
карты, Диагноз.
Создать массив объектов. Вывести:
a) список пациентов, имеющих данный диагноз;
b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */
public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Александр", "Иванов", 22564, "Аутоиммунный гепатит"));
        patients.add(new Patient("Игорь", "Петров", 12896,"Болезнь Рейно"));
        patients.add(new Patient("Наталья", "Абрамова", 84654, "Грипп"));
        patients.add(new Patient("Светлана", "Селезнева", 52964, "Микоплазмоз"));

        System.out.println("Список всех пациентов:");
        for (Patient patient : patients)
            System.out.println(patient.toString());
        System.out.println("");

        //поиск по диагнозу через ввод с консоли
        System.out.print("Введите диагноз: ");
        Scanner scanner = new Scanner(System.in);
        String targetDiagnosis = scanner.nextLine();
        System.out.print("Пациенты с диагнозом " + targetDiagnosis + ":");
        for (Patient patient : patients) {
            if (patient.getDiagnosis().equals(targetDiagnosis)) {
                System.out.println(patient.getName() + " " + patient.getSurname());
            }
        }
        System.out.println("");

        //поиск по номеру мед.карты через ввод с консоли
        System.out.print("Введите номер мед.карты: ");
        int targetId = scanner.nextInt();
        System.out.print("Пациент с номером карты " + targetId + ": ");
        for (Patient patient : patients) {
            if (patient.getMedicalCard() == targetId) {
                System.out.println(patient.getName() + " " + patient.getSurname());
            }
        }
    }
}