package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DemoPostgreSQLJDBC extends JDBCManager{

  public void insertPersonToDB(Person person) throws SQLException{
  if (person == null || person.getName() == null){
  return;
  }
  String insertData1 = "INSERT INTO staffs (name) VALUES ('"
  +person.getName()
  +"');";
  this.getStmt().executeUpdate(insertData1);
  }

  public void deletePersonToDB(Person person) throws SQLException{
  if (person == null || person.getName() == null){
  return;
  }
  String deleteData1 = "DELETE FROM staffs where name = '"+person.getName()
  +"';";
   this.getStmt().executeUpdate(deleteData1);
  }

  public void updateNameToDB(String name , int id) throws SQLException{
  if (name == null || id == 0){
  return;
  }
  String updateData1 = "UPDATE staffs SET name = '"+name 
  +"' WHERE id = "
  +id
  +";";
  this.getStmt().executeUpdate(updateData1);
  }

 @Override 
  public List<Person> getData() throws SQLException{
      if (!this.isConnect()){
      throw new RuntimeException("Database is not conneceted.");
         }
      List<Person> persons = new ArrayList<>();
      ResultSet rs = this.getStmt().executeQuery("select * from staffs");
      while (rs.next()) {
        int idValue = rs.getInt("id");
        String nameValue = rs.getString("name");
        persons.add(new Person(nameValue, idValue));
      }
    return persons;
  }
 
public static void main(String[] args) {
DemoPostgreSQLJDBC jc = new DemoPostgreSQLJDBC();
try{
  jc.login("postgres","admin1234","bootcamp_2504");
    // create table
String createTable1 = "CREATE TABLE IF NOT EXISTS staffs (id BIGSERIAL PRIMARY KEY,name VARCHAR(50));";

    // insert
    //  jc.insertPersonToDB(new Person("Mary",1));

    // select

    System.out.println(jc.getData());

    // update (similar to insert)

    // jc.updateNameToDB("Alice",1);
     

    // delete (similar to insert)

    // jc.deletePersonToDB(new Person("Mary",1));
   

    }catch(SQLException e){
      e.printStackTrace();
    }

  }
}
