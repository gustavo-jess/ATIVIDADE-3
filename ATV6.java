import java.util.Scanner;

public class AT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeProduto = "";
        double precoProduto = 0;
        double percentualDesconto = 0;
        double valorDesconto = 0;
        double novoPreco = 0;
        
        System.out.println("Digite o nome do produto:");
        nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto:");
        precoProduto = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto:");
        percentualDesconto = scanner.nextDouble();

        valorDesconto = precoProduto * (percentualDesconto / 100);

         novoPreco = precoProduto - valorDesconto;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Novo preco com desconto: " + novoPreco);

        scanner.close();
    }
}
