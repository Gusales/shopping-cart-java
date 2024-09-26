import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ListaDeProdutos carrinho = new ListaDeProdutos();

        System.out.println("Usuário, o que você quer deseja fazer?");
        boolean running = true;
        while (running){
            System.out.printf("\n1 - Cadastrar produto\n2 - Ver lista de produtos no carrinho\n3 - Sair\n");
            int option = input.nextInt();
            switch (option){
                case 1:
                    input.nextLine();
                    System.out.println("Digite o nome do produto: ");
                    String nome = input.nextLine();
                    System.out.println("Digite a descrição produto: ");
                    String descricaoProduto = input.nextLine();
                    carrinho.adicionarProduto(new Produto(nome, descricaoProduto));
                    System.out.println("\nProduto adicionado com sucesso!");
                    break;
                case 2:
                    carrinho.verProdutos();
                    break;
                case 3:

                    break;
                case 4:
                    running = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Nenhuma opção selecionada!");
            }
        }
        
    }
}
