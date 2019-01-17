package ultilities;

import ultilities.Logger;
import java.sql.*;

public class InitializeDatabase {

  protected Connection connection;

  /** Table creation Strings */
  private String createTables[] = {
      "CREATE TABLE student (ssn varchar(9), name varchar(100), address varchar(100), PRIMARY KEY (ssn))",
      "CREATE TABLE faculty (ssn varchar(9), name varchar(100), address varchar(100), salary float, PRIMARY KEY (ssn))"
    };

  /** Table deletion strings */
  private String dropTables[] = {"DROP TABLE student",
                                 "DROP TABLE faculty"};

  public void openDatabaseConnection() {

    // Register the MySQL JDBC Driver
    try {
      Class.forName("org.gjt.mm.mysql.Driver");
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
      return;
    }

    // This URL specifies we are connecting with a local database.
    String url = "jdbc:mysql://localhost/uml";

    // Make a connection with the database.
    try {
      connection = DriverManager.getConnection(url,"root","mysql");
    } catch (SQLException e) {
      System.out.println(
	    "Unable to make a connection to the database.\n" +
	    "The reason: " + e.getMessage());
      return;
    }
 }

 public void closeDatabaseConnection() {
   // Close the statement and the connection
   try {
     connection.close();
   } catch (SQLException e) {
      Logger.logError(
      "Unable to make a connection to the database.\n" +
      "The reason: " + e.getMessage());
      return;
   }
 }

                                         
  public void dropTables() throws SQLException {
    openDatabaseConnection();
    Statement st = connection.createStatement();

    for (int i = 0; i < createTables.length; i++) {
        try {
            st.execute(dropTables[i]);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    st.close();
    closeDatabaseConnection();
  }
    
  /** Create tables for database at url */
  public void createTables() throws SQLException {
     openDatabaseConnection();
     Statement st = connection.createStatement();

     for (int i = 0; i < createTables.length; i++) {
              try {
                  st.execute(createTables[i]);
              }
              catch (SQLException sqlException) {
                  sqlException.printStackTrace();
              }
          }

          st.close();
          closeDatabaseConnection();
      }
        
    /** Restore database to initial settings */
    public void resetDatabase() throws SQLException {
        dropTables();
        createTables();
    }
    
    public static void main(String args[]) {
        InitializeDatabase initDB = new InitializeDatabase();
        try {
          initDB.resetDatabase();
        } catch (SQLException e) {
          Logger.logError(e.getMessage());
        }
    }
     
}
