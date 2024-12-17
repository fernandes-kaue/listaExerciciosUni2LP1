public class Produto {
    protected String nome;
    protected double preco;
    protected String codigoDeBarras;

    public Produto(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$" + preco;
    }

    @Override
    public boolean equals(Object obj) {
// TODO adição de logica
        return false;
    }

}
