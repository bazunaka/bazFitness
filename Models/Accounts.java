package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConnection;

public class Accounts {
    public int AccountID;
    public String AccountName;
    public String AccountPswd;

    public boolean CheckAccount(String query, int columnIndex, SQLiteConnection conn) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);
        int count = result.getInt(columnIndex);
        return (count == 1);
    }
}
