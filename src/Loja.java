import java.util.Arrays;

public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("A Casa de Folhas", 333, "Mark Z. Danielewski");
        produtos[1] = new CD("The Marshall Mather LP", 99, 15);
        produtos[2] = new CD("Music To Be Murdered By", 100, 24);
        produtos[3] = new DVD("O Rei Leao", 33, 2.5);
        produtos[4] = new DVD("Interestelar", 123, 3.3);

        for (Produto p : produtos) {
            System.out.println(p);
        }

    }
}
