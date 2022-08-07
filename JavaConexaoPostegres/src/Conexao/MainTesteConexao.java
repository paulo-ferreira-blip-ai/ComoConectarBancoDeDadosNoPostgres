package Conexao;


import java.util.Scanner;

public class MainTesteConexao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resposta = 0;
        boolean c = true;
        while (c==true){
            System.out.println("Digite 1 para adicionar um estado a tabela: ");
            System.out.println("Digite 2 para excluir um estado da tabela: ");
            System.out.println("Digite 3 para mostrar dados da tabela: ");
            System.out.println("Digite 4 para sair: ");

            resposta = input.nextInt();

            switch (resposta){
                case 1:
                    InserirEstado inserindoNovoEstado = new InserirEstado();
                    inserindoNovoEstado.inserir();
                    break;
                case 2:
                    ExcluirEstado excluindoEstado =new ExcluirEstado();
                    excluindoEstado.excluir();
                    break;
                case 3:
                    ListarEBuscarEstado estado = new ListarEBuscarEstado();
                    for (Estado recebendoLista : estado.listar()
                    ) {
                        System.out.println(recebendoLista.toString());

                    }
                    break;
                case 4:
                    c = false;
                    break;

                default:
                    System.out.println("Comando inválido!");

            }
        }
    }

}
