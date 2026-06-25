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
            System.out.println();

            Product product = new Product(ID, nome, categoria, price, qtdProduto);
            estoqueService.cadastrarProduto(product);

        }

        estoqueService.listarProdutos();
        sc.close();
    }
}
