package student.dao;

import java.sql.Statement;
import java.util.Scanner;
import student.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsDAO implements EntityDAO<Student, Integer>
{
  private final Connection connection;

  public StudentsDAO(Connection connection)
  {
    this.connection = connection;
  }

  private static final Scanner scanner = new Scanner(System.in);
  @Override
  public Student create(Student entity)
  {
    Student student = new Student(entity.getName(), entity.getGrade());

    String sqlCommand = "INSERT INTO "
                      + "STUDENTS(   "
                      + "NAME,       "
                      + "GRADE)      "
                      + "VALUES (?,?)";
    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setString(1, entity.getName());
      preparedStatement.setInt(2, entity.getGrade());
      preparedStatement.executeQuery();
      connection.commit();

      sqlCommand = "SELECT PK_ID  "
                 + "FROM STUDENTS "
                 + "WHERE         "
                 + "ROWNUM = 1    "
                 + "ORDER BY      "
                 + "PK_ID DESC    ";

      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sqlCommand);

      if (resultSet.next()) {
        student.setPk_id(resultSet.getInt(1));
      }
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return student;
  }

  @Override
  public Student read(Integer id)
  {
    Student student = null;

    String sqlCommand = "SELECT *       "
                      + "FROM STUDENTS  "
                      + "WHERE PK_ID = ?";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        student = new Student(resultSet.getString(2), resultSet.getInt(3));
        student.setPk_id(resultSet.getInt(1));
      }
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return student;
  }

  @Override
  public Student update(Student entity)
  {
    Student student = null;
    System.out.println("Enter student new grade");
    int studGrade = Integer.parseInt(scanner.next());

    String sqlCommand = "UPDATE STUDENTS "
                      + "SET GRADE = ?   "
                      + "WHERE PK_ID = ? ";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, studGrade);
      preparedStatement.setInt(2, entity.getPk_id());
      preparedStatement.executeQuery();
      connection.commit();

      sqlCommand = "SELECT *       "
                 + "FROM STUDENTS  "
                 + "WHERE PK_ID = ?";

      preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, entity.getPk_id());
      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        student = new Student(resultSet.getString(2), resultSet.getInt(3));
        student.setPk_id(resultSet.getInt(1));
      }
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
    return student;
  }

  @Override
  public void delete(Student entity)
  {
    String sqlCommand = "DELETE         "
                      + "FROM STUDENTS  "
                      + "WHERE PK_ID = ?";

    try {
      connection.setAutoCommit(false);
      PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand);
      preparedStatement.setInt(1, entity.getPk_id());
      preparedStatement.executeQuery();
      connection.commit();

    }catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
