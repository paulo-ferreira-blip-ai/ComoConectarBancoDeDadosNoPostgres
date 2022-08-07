package Conexao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InserirEstado extends Estado {
    public void inserir() {
        try {
            Connection conectandoBancoDeDados = new ConnectionFactures().getConnection();
            Scanner input = new Scanner(System.in);
            Estado e = new Estado();
            System.out.println("ID do Estado: ");
            e.setId(input.nextLine());
            System.out.println("Nome do Estado: ");
            e.setNome_estado(input.nextLine());
            System.out.println("Sigla do Estado: ");
            e.setSigla_estado(input.nextLine());

            String dados = e.getId() + ",\'" + e.getNome_estado() + "\'," + "\'" + e.getSigla_estado() + "\'" + " )";
            String declaracao = "INSERT INTO estado (id_estado, nome_estado, sigla_estado)" + "values (";
            String sql = declaracao + dados;
            System.out.println(sql);

            String SQL = sql;

            Statement stmt = conectandoBancoDeDados.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
