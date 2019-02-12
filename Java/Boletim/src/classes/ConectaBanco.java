package classes;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://127.0.0.1:3306/escola";
    private final String usuario = "root";
    private final String senha = "1991";
    public Connection conn;

    public Connection conecte() {

        System.setProperty("jdbc.Drives", driver);

        conn = null;

        try {
            
            conn = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n" + ex.getMessage());

        }

        return conn;
    }

    public void executeSQL(String sql) {
        try {

            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);

            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta sql");
        }
    }
}
