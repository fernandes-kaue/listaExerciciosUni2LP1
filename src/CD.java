public class CD extends Produto {
    private final int numeroDeFaixas;

    public CD(String nome, double preco, String codigoDeBarras, int numeroDeFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Faixas: " + numeroDeFaixas;
    }
}
