package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.EmployerDao;
import ru.itsjava.jdbc.dao.EmployerDaoJdbcImpl;

import java.sql.*;

@SuppressWarnings("ALL")
public class JdbcPractice {
//    private final static String DB_URL = "jdbc:MySql://localhost:3306/natasha_schema?serverTimezone=UTC";
//    private final static String DB_NAME = "";
//    private final static String DB_PASSWORD = "";

    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT emp.name, emp.age FROM employers emp, departments dep " +
//                    "where emp.dep_id = dep.id and dep_id = 1");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getInt("age"));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

        EmployerDao dao = new EmployerDaoJdbcImpl();
        System.out.println("dao.findByName(\"masha\") = " + dao.findByName("Masha"));
    }
}
//1. Url, login и password к БД   +
//2. Драйвер в зависимостях       +
//3. JDBC (встроен внутрь JDK)    +
//4. Написать свой DAO            +


//DAO message + user  (find и select)
//User findByName(String name)
//List<Message> findAllByUser(User user)