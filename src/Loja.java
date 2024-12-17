public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[9];

        produtos[8] = new Livro("A Casa de Folhas", 333, "656", "Mark Z. Danielewski");
        produtos[7] = new Livro("A nausea", 222, "3210", "Sartre");
        produtos[6] = new Livro("A Casa de Folhas", 333, "666", "Mark Z. Danielewski");

        produtos[5] = new CD("The Marshall Mather LP", 99, "1989", 15);
        produtos[4] = new CD("Music To Be Murdered By", 100, "2022", 24);
        produtos[3] = new CD("The Marshall Mather LP", 99, "1999", 15);

        produtos[2] = new DVD("O Rei Leao", 33, "2004", 2.5);
        produtos[1] = new DVD("Interestelar", 123, "2014", 3.3);
        produtos[0] = new DVD("O Rei Leao", 33, "2013", 2.5);


        Produto produtoBuscado = new Livro("A Casa de Folhas", 333, "666", "Mark Z. Danielewski");
        Produto produtoBuscado1 = new Livro("A Casa de Folhas", 333, "766", "Mark Z. Danielewski");

        System.out.println("Busca por produto com codigo existent");
        System.out.println(buscarProduto(produtos, produtoBuscado));
        System.out.println("Busca por produto sem codigo existente");
        System.out.println(buscarProduto(produtos, produtoBuscado1));

    }

    public static int buscarProduto(Produto[] produtos, Produto produtoBuscado) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(produtoBuscado)) {
                return i;
            }
        }
        return -1;
    }

}
