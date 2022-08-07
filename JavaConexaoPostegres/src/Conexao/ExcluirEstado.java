package Conexao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class ExcluirEstado extends Estado{
    public void excluir(){
        try {
            Connection con = new ConnectionFactures().getConnection();
            Scanner input = new Scanner(System.in);
            Estado e = new Estado();
            System.out.println("ID do Estado que deseja exluir: ");
            e.setId(input.next());

            String dados = e.getId();
            String declaracao = "DELETE FROM estado" + " WHERE id_estado = ";
            String sql = declaracao + dados;
            System.out.println(sql);

            String SQL = sql;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
