package services;

// Responsável por manter a lista de produtos

import entities.Product;

import java.util.List;

public class EstoqueService {
    private List<Product> products;

    public EstoqueService(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public void cadastrarProduto(Product p) {
        products.add(p);
    }

    public void listarProdutos() {
        int contador = 0;
        for (Product product : products) {
            System.out.println("Item de Nº " + (contador + 1));
            product.exibirResumo();
            contador++;
            System.out.println();
        }
    }

    public void buscarPorNome(String nome) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(nome)) {
                product.exibirResumo();
            }
        }
    }

    public void buscarPorId(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.exibirResumo();
            }
        }
    }

    public void apagarProdutoDoEstoque(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
        for (Product product : products){
            product.exibirResumo();
        }
    }

    public void apagarProdutoDoEstoque(String nome) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(nome)) {
                products.remove(product);
                break;
            }

        }
        for (Product product : products){
            product.exibirResumo();
        }
    }

    public void adicionarProduto(int qtde, int id) {
        for (Product product : products) {
            if (product.getId() == id){
                product.adicionarEstoque(qtde);
                product.exibirResumo();
            }
        }
    }

    public void adicionarProduto(int qtde, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)){
                product.adicionarEstoque(qtde);
                product.exibirResumo();
            }
        }
    }

    public void removerProduto(int qtde, int id) {
        for (Product product : products) {
            if (product.getId() == id){
                product.removerEstoque(qtde);
                product.exibirResumo();
            }
        }
    }

    public void removerProduto(int qtde, String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)){
                product.removerEstoque(qtde);
                product.exibirResumo();
            }
        }
    }


}
