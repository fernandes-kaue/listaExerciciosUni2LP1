public class DVD extends Produto{
    private double duracao;

    @Override
    public String toString() {
        return super.toString() + "\n Duração: " + duracao;
    };
}