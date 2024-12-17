public class CD extends Produto{
    private int numeroDeFaixas;

    public CD(String nome, double preco, int numeroDeFaixas) {
        super(nome, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Faixas: " + numeroDeFaixas;
    }
}
