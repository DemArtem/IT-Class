package IT_Class.M22_Files.WebDAV;

import java.io.FileWriter;
import java.io.IOException;
/*
WebDAV (Web-based Distributed Authoring and Versioning)
Зарегистрироваться на
yandex.ru

Зайти на
https://id.yandex.ru/

Подтверждение на электронную почту
Создать пароль приложения Безопасность->Пароль приложения
Проводник -> Подключить сетевой диск ->
https://webdav.yandex.ru

WebDAV
hsowlprnbapkctoz

http://www.4sharedfb.com/features

sign up
Проводник->Этот компьютер
Компьютер->Подключить сетевой диск
 */
public class WebDAVYandex {
    public static void main(String[] args) {
        //Задаем имя файла
        String fileName = "y:/data.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.printf("Не удалось создать файл \"%s\"", fileName);
        }
        if (fw == null) return;
        String s = "Строка для записи";
        try {
            fw.append(s);
            fw.close();
        } catch (IOException e) {
            System.out.printf("Не удалось записать в файл \"%s\"", fileName);
        }
    }
}
