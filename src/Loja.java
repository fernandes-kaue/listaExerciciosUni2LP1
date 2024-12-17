public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[15];

        produtos[0] = new Livro("A Casa de Folhas", 333, "666", "Mark Z. Danielewski");
        produtos[1] = new Livro("A nausea", 222, "3210", "Sartre");
        produtos[2] = new Livro("A Casa de Folhas", 333, "666", "Mark Z. Danielewski");

        produtos[3] = new CD("The Marshall Mather LP", 99, "1999", 15);
        produtos[4] = new CD("Music To Be Murdered By", 100, "2022", 24);
        produtos[5] = new CD("The Marshall Mather LP", 99, "1999", 15);

        produtos[6] = new DVD("O Rei Leao", 33, "2003", 2.5);
        produtos[7] = new DVD("Interestelar", 123, "2014", 3.3);
        produtos[8] = new DVD("O Rei Leao", 33, "2003", 2.5);

        for (Produto p : produtos) {
            System.out.println(p);
        }

    }
}
