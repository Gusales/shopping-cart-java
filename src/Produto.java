import java.util.UUID;

public class Produto {
    private String idProduto;
    private StringBuffer nomeProduto;
    private StringBuilder descricaoProduto;

    public Produto(String nomeProduto, String descricaoProduto) {
        this.idProduto = UUID.randomUUID().toString();
        this.nomeProduto = new StringBuffer (nomeProduto);
        this.descricaoProduto = new StringBuilder(descricaoProduto);
    }

    public String getIdProduto() {
        return idProduto;
    }

    public StringBuffer getNomeProduto() {
        return nomeProduto;
    }

    public StringBuilder getDescricaoProduto() {
        return descricaoProduto;
    }

    public void alterarDescricao(String descricao) {
        this.descricaoProduto.replace(0, this.descricaoProduto.length(), descricao);
    }

    public void alterarNome(String nome){
        this.nomeProduto.replace(0, this.nomeProduto.length(), nome);
    }
}
