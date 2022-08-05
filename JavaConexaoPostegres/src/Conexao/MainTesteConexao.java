package Conexao;

import java.sql.ResultSet;
import java.util.Scanner;

public class MainTesteConexao {
    public static void main(String[] args) {
        ConnectionFacture con = new ConnectionFacture();
       /* con.getConnection();


        String SQL = "INSERT INTO estado (id_estado, nome_estado, sigla_estado)" +
                "values (default, 'Pará', 'PA')";
        int receber = con.adicionarEstado(SQL);
        if (receber > 0){
            System.out.println("Cadastro Realizado!");
        }else {
            System.out.println("Cadastro não realizado.");
        }*/

        String SQLbuscaEstado = "Selec * from estado";
        ResultSet rs = con.buscaEstado(SQLbuscaEstado);

        try {
            while (rs.next()){
                int id_estado = rs.getInt("id_estado");
                String nomeEstado = rs.getString("nome_estado");
                String siglaEstado = rs.getString("sigla_estado");
                System.out.println(id_estado+ " - "+ nomeEstado+" - "+siglaEstado);
            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
