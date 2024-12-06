public class CD extends Produto{
    private int numFaixas;

    @Override
    public String toString() {
        return super.toString() + "\n Número de Faixas: " + numFaixas;
    };
}
