package domain.labMember;

import domain.database.DataBaseConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LabMemberListInDB implements ILabMemberList {

  private DataBaseConnector dataBaseConnector;

  public LabMemberListInDB() {
    this.dataBaseConnector = new DataBaseConnector();
  }

  @Override
  public Map<String, ILabMember> getLabMemberMap() {
      Map<String, ILabMember> labMemberMap = new HashMap<>();
      Connection connection = dataBaseConnector.connect();
      Statement statement = null;
      ResultSet resultSet = null;
      String sql = "SELECT * FROM User";
      ILabMember labMember = null;
      try {
          statement = connection.createStatement();
          resultSet = statement.executeQuery(sql);

          while(resultSet.next()) {
              if(resultSet.getString("permission") == "Admin")
                  labMember = new Admin();
              else if(resultSet.getString("permission") == "Manager")
                  labMember = new Manager();
              else labMember = new Viewer();

              labMember.setName(resultSet.getString("name"));
              labMember.setId(resultSet.getString("id"));
              labMember.setEmail(resultSet.getString("email"));
              labMember.setPhone(resultSet.getString("phone"));
              labMember.setPassword(resultSet.getString("password"));
              labMember.setPermission(resultSet.getString("permission"));
              labMemberMap.put(labMember.getId(), labMember);
          }
      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
        dataBaseConnector.closeResultSet(resultSet);
        dataBaseConnector.closeStatement(statement);
        dataBaseConnector.closeConnect(connection);
        return labMemberMap;
      }
  }

  @Override
  public boolean addLabMember(ILabMember labMember) {
      Connection connection = dataBaseConnector.connect();
      Statement statement = null;
      String id = UUID.randomUUID().toString();
      String sql = "INSERT INTO User VALUES ('"+ id + "','" + labMember.getName() +
        "','" + labMember.getEmail() + "','" + labMember.getPhone() + "','"+
        labMember.getPassword() + "','"+ labMember.getPermission() + "')";
      try {
          statement = connection.createStatement();
          statement.executeUpdate(sql);
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        dataBaseConnector.closeStatement(statement);
        dataBaseConnector.closeConnect(connection);
        return true;
      }
  }

  @Override
  public boolean removeLabMemberById(String id) {
      Connection connection = dataBaseConnector.connect();
      Statement statement = null;
      String sql = "DELETE FROM User WHERE id='"+ id +"'";
      try {
        statement = connection.createStatement();
        statement.executeUpdate(sql);
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        dataBaseConnector.closeStatement(statement);
        dataBaseConnector.closeConnect(connection);
        return true;
      }
  }

  @Override
  public ILabMember findLabMemberById(String id) {
    Connection connection = dataBaseConnector.connect();
    Statement statement = null;
    ResultSet resultSet = null;
    String sql = "SELECT * FROM User WHERE id='"+ id +"'";
    ILabMember labMember = null;
    try {
      statement = connection.createStatement();
      resultSet = statement.executeQuery(sql);

      if(resultSet.getString("permission") == "Admin")
        labMember = new Admin();
      else if(resultSet.getString("permission") == "Manager")
        labMember = new Manager();
      else labMember = new Viewer();

      labMember.setName(resultSet.getString("name"));
      labMember.setId(resultSet.getString("id"));
      labMember.setEmail(resultSet.getString("email"));
      labMember.setPhone(resultSet.getString("phone"));
      labMember.setPassword(resultSet.getString("password"));
      labMember.setPermission(resultSet.getString("permission"));
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      dataBaseConnector.closeStatement(statement);
      dataBaseConnector.closeConnect(connection);
      return labMember;
    }
  }

  public static void main(String[] args) {
      ILabMemberList labMemberList = new LabMemberListInDB();
      Map<String, ILabMember> map = labMemberList.getLabMemberMap();
  }
}
