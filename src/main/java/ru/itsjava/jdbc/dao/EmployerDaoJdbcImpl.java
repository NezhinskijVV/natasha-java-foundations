package ru.itsjava.jdbc.dao;

import ru.itsjava.jdbc.domain.Employer;

import java.sql.*;

@SuppressWarnings("ALL")
public class EmployerDaoJdbcImpl implements EmployerDao {
    private final static String DB_URL = "jdbc:MySql://localhost:3306/natasha_schema?serverTimezone=UTC";
    private final static String DB_NAME = "";
    private final static String DB_PASSWORD = "";

//    @Override
//    public Employer findByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT emp.name, emp.age FROM employers emp, departments dep " +
//                    "where emp.dep_id = dep.id and emp.name = '" + name + "'");
//            resultSet.next();
//            return new Employer(resultSet.getString("name"), resultSet.getInt("age"));
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return null;
//    }




    @Override
    public Employer findByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_NAME, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT emp.name, emp.age FROM employers emp, departments dep " +
                     "where emp.dep_id = dep.id and emp.name = ?")
        ) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return new Employer(resultSet.getString("name"), resultSet.getInt("age"));

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
