package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFacture {
    private String url = "jdbc:postgresql://localhost:5432/money";
    private String user = "postgres";
    private String senha = "123456";
    public static Connection con;

    public Connection getConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,user,senha);
            if(con != null){
                System.out.println("Conectado!");

            }else {
                System.out.println("Não Conectado");
            }

        }catch (Exception e){
            System.out.println("Erro de conexão"+e);
            e.printStackTrace();

        }

        return con;
    }
}
