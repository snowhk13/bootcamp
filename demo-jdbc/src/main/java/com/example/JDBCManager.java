package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCManager {


    public static String userId = "postgres";
    public static String password = "admin1234";
    public static String databaseUrl = "jdbc:postgresql://localhost:5432/bootcamp_2504";

    private Connection conn;
    private PreparedStatement stmt;

  public Connection getConn() {
      return conn;
    }

    public Statement getStmt() {
      return stmt;
    }

  public JDBCManager() {

  }

  public boolean isConnect(){
    return this.conn != null && this.stmt != null;
  }

  public void login(String userId,String password,String database) throws SQLException{
    if (isConnect()){
      return;
    }
    if(userId == null || password == null || database == null){
      return;
    }
   String url = "jdbc:postgresql://localhost:5432/";
   this.conn = DriverManager.getConnection(url+database, userId, password);
   this.stmt = connection.PreparedStatement
  }

  public List<Person> getData() throws SQLException{
      if (!this.isConnect()){
      throw new RuntimeException("Database is not conneceted.");
         }

      List<Person> persons = new ArrayList<>();
      ResultSet rs = stmt.executeQuery("select * from staffs");
      while (rs.next()) {
        int idValue = rs.getInt("id");
        String nameValue = rs.getString("name");
        persons.add(new Person(nameValue, idValue));
      }
    return persons;
  }

  public static void main(String[] args) {
    JDBCManager jc = new JDBCManager();
    try{
    jc.login("postgres","admin1234","bootcamp_2504");
 

    String createTable1 = "CREATE TABLE IF NOT EXISTS staffs (id BIGSERIAL PRIMARY KEY,name VARCHAR(50));";

    jc.getStmt().executeUpdate(createTable1);

      String insertData1 =
      "INSERT INTO staffs (name) VALUES ('Peter');";
      // jc.getStmt().executeUpdate(insertData1);

      System.out.println(jc.getData());

   }catch(SQLException e){
      e.printStackTrace();
    }



  }
  
}
