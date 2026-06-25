package entities;

public class Product {
    private Integer id;
    private String name;
    private String Categoria;
    private Double price;
    private Integer quantidade;

    public Product(Integer id, String name, String categoria, Double price, Integer quantidade) {
        this.id = id;
        this.name = name;
        Categoria = categoria;
        this.price = price;
        this.quantidade = quantidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    // Sem setQuantidade, pois essa ação vem dos metodos adicionarEstoque() e removerEstoque();

    public void adicionarEstoque(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }

    public void exibirResumo() {
        System.out.println("==================================");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getName());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Preço: " + getPrice());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("==================================");
    }
}
