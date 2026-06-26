package entities;

public class Product {
    private Integer id;
    private String name;
    private String categoria;
    private Double price;
    private Integer quantidade;

    public Product(Integer id, String name, String categoria, Double price, Integer quantidade) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
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
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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


    // Os dois metodos abaixo são necessarios, pois como a ação de adicionar e aumentar o número de itens no estoque fica dentro da classe EstoqueService,
    // foi necessario criar metodos na classe Product para aumentar e dimunir a quantidade de produtos, e assim usar somente a chamada do metodo na classe Estoque.

    public void adicionarEstoque(int qtde){
        this.quantidade += qtde;
    }

    public void removerEstoque(int qtde){
        this.quantidade -= qtde;
    }

    public void exibirResumo() {
        System.out.println("==================================");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getName());
        System.out.println("categoria: " + getCategoria());
        System.out.println("Preço: " + getPrice());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("==================================");
    }


}
