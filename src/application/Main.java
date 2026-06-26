package application;

import entities.Product;
import services.EstoqueService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        EstoqueService estoqueService = new EstoqueService(productList);

        System.out.println("=== Controle de Estoque ===");

        System.out.print("Quantos produtos irá cadastrar: ");
        int numCadastro = sc.nextInt();
        System.out.println();

        for (int i = 0; i < numCadastro; i++) {
            System.out.print("Insira o ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("Insira o Nome: ");
            String nome = sc.nextLine();
            System.out.print("Insira Categoria: ");
            String categoria = sc.nextLine();
            System.out.print("Insira o Preço: ");
            Double price = sc.nextDouble();
            System.out.print("Insira a Quantidade: ");
            int qtdProduto = sc.nextInt();
            sc.nextLine();
            System.out.println();

            Product product = new Product(ID, nome, categoria, price, qtdProduto);
            estoqueService.cadastrarProduto(product);

        }

        estoqueService.listarProdutos();

        System.out.print("Informe o nome do Produto que Deseja encontrar: ");
        String produtoProcurado = sc.nextLine();

        estoqueService.buscarPorNome(produtoProcurado);

        System.out.println("Informe o Produto que deseja acrescentar a quantidade: ");
        System.out.print("Buscar por ID ou Nome: 1 = ID /  2 = Nome: ");
        int escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == 2){
            System.out.print("Informe o nome do Produto: ");
            String nomeProdutoParaAdicionar = sc.nextLine();
            System.out.println("Informe a quantidade que deseja acrescentar");
            int qtdeAcrescentada = sc.nextInt();
            estoqueService.adicionarProduto(qtdeAcrescentada, nomeProdutoParaAdicionar);
        } else {
            System.out.print("Informe o ID do Produto: ");
            int idProdutoParaAdicionar = sc.nextInt();
            System.out.print("Informe a quantidade que deseja acrescentar");
            int qtdeAcrescentada = sc.nextInt();
            estoqueService.adicionarProduto(qtdeAcrescentada, idProdutoParaAdicionar);
        }

        System.out.println("Informe o Produto que deseja remover a quantidade: ");
        System.out.print("Buscar por ID ou Nome: 1 = ID /  2 = Nome: ");
        int escolha02 = sc.nextInt();
        sc.nextLine();
        if (escolha02 == 2){
            System.out.print("Informe o nome do Produto: ");
            String nomeProdutoParaAdicionar = sc.nextLine();
            System.out.print("Informe a quantidade que deseja tirar quantidade de estoque: ");
            int qtdeAcrescentada = sc.nextInt();
            estoqueService.removerProduto(qtdeAcrescentada, nomeProdutoParaAdicionar);
        } else {
            System.out.print("Informe o ID do Produto: ");
            int idProdutoParaAdicionar = sc.nextInt();
            System.out.print("Informe a quantidade que deseja remover: ");
            int qtdeAcrescentada = sc.nextInt();
            estoqueService.removerProduto(qtdeAcrescentada, idProdutoParaAdicionar);
        }






        sc.close();
    }
}
