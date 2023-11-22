import java.util.ArrayList;
import java.util.List;

public class Colecao {
    private List<Veiculo> colecao = new ArrayList<Veiculo>();
    private String cabecalho = """
                  CARROS DA COLEÇÃO -> 2023
            """;
    private String linha = """
        -------------------------------------
        """;

    public Colecao() {
    }

    public void addVeiculoColecao(Veiculo veiculo) {
        Veiculo novo = veiculo;
        this.colecao.add(novo);
        System.out.println(veiculo.getCor());
    }

    public void mostrarColecao(){
        System.out.println(linha);
        System.out.println(cabecalho);
        System.out.println(linha);



        for (Veiculo carro: colecao){
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println(linha);
        }

        if(colecao.isEmpty()){
            System.out.println("VOCÊ AINDA NÃO CADASTROU NENHUM CARRO");
        } else {
            System.out.println("TOTAL DE " + colecao.size() + " CADASTRADOS");
        }
        System.out.println(linha);
    }

}
