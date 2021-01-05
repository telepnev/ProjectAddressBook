package ru.telepnev.AddressBook.tests;

import org.testng.annotations.Test;
import ru.telepnev.AddressBook.model.GroupData;

import java.sql.*;

public class DbConnectionTest {

    @Test
    public void testDbConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/addressbook?user=root&password=");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select group_id,group_name,group_header,group_footer from group_list");
            while (rs.next()) {
                // TODO: 05.01.2021 сделать флюинс интерфейс и вернуться к этому шагу позже .... Так же посмотреть инфу про тайм зону
//                new GroupData().withId(rs.getInt("group_id"))
            }


        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
