/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanlt.conn;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author AVITA
 */
public class MyConnection implements Serializable {

    public static Connection getMyConnection() throws SQLException, NamingException {
        Context context = new InitialContext();
        Context tomContext = (Context) context.lookup("java:comp/env");
        DataSource ds = (DataSource) tomContext.lookup("SE1425");
        Connection conn = ds.getConnection();
        return conn;
    }
}
