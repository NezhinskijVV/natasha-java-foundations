package ru.itsjava.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {

//        Properties props = new Properties();
//        props.load(new FileInputStream(
//                new File("src/main/resources/application.properties")));
//
//
//        System.out.println(props.getProperty("key1"));
//        System.out.println(props.getProperty("db.url"));


        InputStream resourceAsStream = PropertiesPractice.class
                .getClassLoader().getResourceAsStream("application.properties");
        Properties props = new Properties();
        props.load(resourceAsStream);

        System.out.println(props.getProperty("key1"));
        System.out.println(props.getProperty("db.url"));

    }
}

//HW
// 1. Найти всех женщин с возрастом меньше 18 и для них вывести (несовершенолетние)
// 2. Найти всех мужчин с возрастом > 21 и для них вывести (алкоголь можна)
// 3. Найти всех мужчин у которых имя начинается на A и всех Анн
// 4. Найти количество Ань
// 5. Вернуть список всех женщин
// 6. Проверить наличие Марата
// 7. Найти первую Аню в списке
// 8. Вернуть список возрастов
// 9. Найти первых трех мужчин в списке
// 10. Отсортировать (по имени) и вернуть различных person
// возраст которых от 15 до 37 и вывести их всех через пробел


//11. Создать класс Settings (внутри него Properties)
//Внутри которого мы будем читать по ключу из проперти файла

