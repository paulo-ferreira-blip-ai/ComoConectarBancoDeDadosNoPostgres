package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public int adicionarEstado(String SQL){
        try {
            Statement stmt = con.createStatement();
            int receber = stmt.executeUpdate(SQL);
            con.close();
            return receber;

        }catch (Exception e){
            e.printStackTrace();
        }


        return 0;
    }

    public ResultSet buscaEstado(String SQLbuscaEstado){
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQLbuscaEstado);
            return rs;

        }catch (Exception e){
            e.printStackTrace();

        }

        return null;

    }
}
