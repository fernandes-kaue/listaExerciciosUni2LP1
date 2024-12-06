public class Livro extends Produto{
    private String autor;

    @Override
    public String toString() {
        return super.toString() + "\n Autor: " + autor;
    };
}
