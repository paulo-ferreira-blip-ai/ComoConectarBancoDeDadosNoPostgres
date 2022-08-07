package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactures {

    public static Connection con;

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/money", "postgres", "123456");
            if (con != null) {
                System.out.println("Conectado!");

            } else {
                System.out.println("Não Conectado");
            }
        } catch (Exception e) {
            System.out.println("Erro de conexão" + e);
            e.printStackTrace();
        }
        return con;
    }
}
