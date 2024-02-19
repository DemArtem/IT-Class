package IT_Class.M21_Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Time;

/*
id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
Дебет, Кредит, Время городских и междугородных разговоров
 */
public class Phone {

    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String number;
    private int debit;
    private int credit;
    private Time cityTime;
    private Time incityTime;
    private Time intercityTime;
    private JTextField textField1;
    private JTable table;
    private JComboBox comboBox1;
    private JButton addButton;
    private JButton deliteButton;
    private JButton editButton;


    public Phone(String surname, String name, String address, String number) {
        this.surname = surname;

        this.name = name;
        this.address = address;
        this.number = number;

        String[] columnNames = {"Surname", "Name", "Address","Number"};
        new DefaultTableModel(null, columnNames);
        TableModel model = null;
        table.setModel(model);
    }

    private long id;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {

        this.credit = credit;
    }

    public Time getCityTime() {
        return cityTime;
    }

    public void setCityTime(Time cityTime) {
        this.cityTime = cityTime;
    }

    public Time getIncityTime() {
        return incityTime;
    }

    public void setIncityTime(Time incityTime) {
        this.incityTime = incityTime;
    }

    public Time getIntercityTime() {
        return intercityTime;
    }

    public void setIntercityTime(Time intercityTime) {
        this.intercityTime = intercityTime;
    }

    public static class Phones {
    }
}