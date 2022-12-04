package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class References {
    public int ReferencesID = 0;
    public int MenusID = 1;
    public String ReferencesName = "";

    public List<String> selectReferences(int MenusID, Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(
                "SELECT r.ReferencesName FROM 'References' r WHERE r.MenuID = '" + MenusID + "';");
        List<String> references = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(1);
            references.add(name);
        }
        return references;
    } 
}
