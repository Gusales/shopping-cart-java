import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {
    private final List<Produto> carrinho = new ArrayList<Produto>();

    public void adicionarProduto(Produto item){
        this.carrinho.add(item);
    }

    public void verProdutos(){
        int contador = 0;
        if (!this.carrinho.isEmpty()){
            for(Produto item : carrinho){
                System.out.printf(
                        "Produto %02d\nid: %s\nNome: %s\nDescrição: %s\n",
                        contador + 1,
                        item.getIdProduto(),
                        item.getNomeProduto(),
                        item.getDescricaoProduto()
                );
                System.out.println("-".repeat(10));
                contador++;
            }
        }
        else{
            System.out.println("Nenhum produto cadastrado!");
        }
    }

    public void alterarInformacaoProduto(){

    }
}
