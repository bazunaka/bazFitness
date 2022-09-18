package bazfitness;

import java.sql.SQLException;

public class BazFitness {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Hello World!");

        Database.Connect();

        // Database.InsertDB();
    }

}
