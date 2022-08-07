package Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ListarEBuscarEstado extends Estado {
     public  List<Estado> listar() {
         List<Estado> estados = new ArrayList<>();

        try {
            Connection con = new ConnectionFactures().getConnection();
            PreparedStatement smt = con.prepareStatement("Select * from estado");
            ResultSet rs = smt.executeQuery();

            while (rs.next()){
                Estado e = new Estado();
                e.setId(rs.getString("id_estado"));
                e.setNome_estado(rs.getString("nome_estado"));
                e.setSigla_estado(rs.getString("sigla_estado"));

                estados.add(e);
            }

            rs.close();
            smt.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }


         return estados;
     }



}
