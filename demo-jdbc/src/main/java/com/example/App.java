package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * Hello world!
 */
public final class App {

  public static void insertPersonToDB(Person person) {
    String userId = "root";
    String password = "admin1234";
    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/bootcamp_2504";
    try {
      Connection conn =
          DriverManager.getConnection(databaseUrl, userId, password);
      Statement stmt = conn.createStatement();
      String insertData1 = "insert into JDBC_MYSQL_TABLE value ("
          + person.getId() + ",'" + person.getName()
          + "') on duplicate key update id=" + person.getId();
      stmt.executeUpdate(insertData1);
    } catch (SQLException e) {

    }

  }

  public static List<Person> getPersonsFromDB() {
    String userId = "root";
    String password = "admin1234";
    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/bootcamp_2504";
    List<Person> persons = new ArrayList<>();
    try {
      Connection conn =
          DriverManager.getConnection(databaseUrl, userId, password);
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery("select * from JDBC_MYSQL_TABLE");
      while (rs.next()) {
        int idValue = rs.getInt("id");
        String nameValue = rs.getString("name");
        persons.add(new Person(nameValue, idValue));
      }
    } catch (SQLException e) {

    }
    return persons;

  }

  /**
   * Says hello to the world.
   * 
   * @param args The arguments of the program.
   */
  public static void main(String[] args) {
    String userId = "root";
    String password = "admin1234";
    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/bootcamp_2504";

    try {
      Connection conn =
          DriverManager.getConnection(databaseUrl, userId, password);
      Statement stmt = conn.createStatement();

      String createTableStmt =
          "create table if not exists JDBC_MYSQL_TABLE (id bigint primary key,name varchar(50))";
      stmt.executeUpdate(createTableStmt);

      String insertData1 =
          "insert into JDBC_MYSQL_TABLE value (1,'John') on duplicate key update id=1";
      stmt.executeUpdate(insertData1);
      List<Person> persons = new ArrayList<>();

      ResultSet rs = stmt.executeQuery("select * from JDBC_MYSQL_TABLE");

      while (rs.next()) {
        int idValue = rs.getInt("id");
        String nameValue = rs.getString("name");
        persons.add(new Person(nameValue, idValue));
        System.out.println("id: " + idValue + ", name: " + nameValue);
      }

      List<Person> persons2 =
          new ArrayList<>(Arrays.asList(new Person("Ken", 4),
              new Person("Mary", 5), new Person("Rey", 6)));

      persons2.stream().forEach(p -> App.insertPersonToDB(p));

      System.out.println(App.getPersonsFromDB());


    } catch (SQLException e) {

    }
  }


}
