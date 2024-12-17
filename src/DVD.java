public class DVD extends Produto{
    private final double duracao;

    public DVD(String nome, double preco, String codigoDeBarras , double duracao) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duração: " + duracao + " minutos";
    }
}