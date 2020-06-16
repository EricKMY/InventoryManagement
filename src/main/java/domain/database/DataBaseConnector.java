package domain.database;

import domain.labMember.LabMember;

import java.sql.*;
import java.util.UUID;

public class DataBaseConnector {
  private String databaseName = "LabInventorySystem";
  public DataBaseConnector() {
      createDatabase();
      createUserTable();
      InsertAdminAndManager(); //just use once.
  }

  public Connection connect() {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/" + databaseName + "?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false";
    String user = "root";
    String password = "root";

    Connection connection = null;
    try{
      Class.forName(driver);
      connection = DriverManager.getConnection(url, user, password);
    }
    catch(Exception e){
      e.printStackTrace();
    }

    return connection;
  }

  public void closeConnect(Connection connection) {
    try{
      connection.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  public void closeStatement(Statement statement) {
    try {
      statement.close();
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }

  public void closeResultSet(ResultSet resultSet) {
    try{
      resultSet.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  private void createDatabase() {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false";
    String user = "root";
    String password = "root";

    Connection connection = null;
    try{
      Class.forName(driver);
      connection = DriverManager.getConnection(url,user, password);
    }
    catch(Exception e){
      e.printStackTrace();
    }

    Statement statement = null;
    String sql = "CREATE DATABASE IF NOT EXISTS " + databaseName;

    try {
      statement = connection.createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException throwable) {
      throwable.printStackTrace();
    }
  }

  private void createUserTable() {
    Connection connection = this.connect();
    Statement statement = null;
    String sql = "CREATE TABLE IF NOT EXISTS User (id VARCHAR(50) not NULL, name VARCHAR(50), email VARCHAR(50), phone VARCHAR(50), password VARCHAR(50), permission VARCHAR(50) not NULL)";
    try {
      statement = connection.createStatement();
      statement.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.closeStatement(statement);
      this.closeConnect(connection);
    }
  }

  private void InsertAdminAndManager() {
    Connection connection = this.connect();
    Statement statement = null;
    String id = UUID.randomUUID().toString();
    String sql = "INSERT INTO User (id, name, email, phone, password, permission) SELECT '"+ id
            + "','Admin','admin@gmail.com','0912345678','admin','Admin' FROM User WHERE NOT EXISTS "
            + " (SELECT email FROM User WHERE email='admin@gmail.com')";
    id = UUID.randomUUID().toString();
    String sql2 = "INSERT INTO User (id, name, email, phone, password, permission) SELECT '"+ id
            + "','Manager','manager@gmail.com','0987654321','manager','Manager' FROM User WHERE NOT EXISTS "
            + "(SELECT email FROM User WHERE email='manager@gmail.com')";
    try {
      statement = connection.createStatement();
      statement.executeUpdate(sql);
      statement.executeUpdate(sql2);
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      this.closeStatement(statement);
      this.closeConnect(connection);
    }
  }

  public static void main(String[] args) {
    DataBaseConnector dataBaseConnector = new DataBaseConnector();
    Connection connection = dataBaseConnector.connect();
    Statement statement = null;
    ResultSet resultSet = null;
    String sql = "SELECT * FROM User WHERE name = 'Admin'";

    LabMember labMember = null;

    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);
      while(resultSet.next()) {
        labMember = new LabMember();
        labMember.setName(resultSet.getString("name"));
        labMember.setEmail(resultSet.getString("email"));
        labMember.setId(resultSet.getString("id"));
        labMember.setPassword(resultSet.getString("password"));
        labMember.setPermission(resultSet.getString("permission"));
        labMember.setPhone(resultSet.getString("phone"));
      }
      System.out.println(labMember.getEmail());
      System.out.println(labMember.getId());
      System.out.println(labMember.getName());
      System.out.println(labMember.getPassword());
      System.out.println(labMember.getPermission());
      System.out.println(labMember.getPhone());
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      dataBaseConnector.closeResultSet(resultSet);
      dataBaseConnector.closeStatement(statement);
      dataBaseConnector.closeConnect(connection);
    }

  }
}
