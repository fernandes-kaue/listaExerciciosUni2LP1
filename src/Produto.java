public class Produto {
    private String nome;
    private double preco;

    @Override
    public String toString() {
        return String.format("Nome: %s %n Preço: %d %n", nome, preco);
    }
}
