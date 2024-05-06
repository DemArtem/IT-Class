package _Java.HomeWorks.HW12_OOP.Patients;

public class Patient {
    private String name;
    private String surname;
    private int medicalCard;
    private String diagnosis;

    public Patient(String name, String surname, int medicalCard, String diagnosis) {

        this.name = name;
        this.surname = surname;
        this.medicalCard = medicalCard;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMedicalCard() {
        return medicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", medicalCard=" + medicalCard +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}


