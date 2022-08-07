package Conexao;

public class Estado {
    private String id;
    private String nome_estado;
    private String sigla_estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getSigla_estado() {
        return sigla_estado;
    }

    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    @Override
    public String toString() {
        return "Estado: Infos {" +
                "id=" + id +
                ", nome_estado='" + nome_estado + '\'' +
                ", sigla_estado='" + sigla_estado + '\'' +
                '}';
    }
}
