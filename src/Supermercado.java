public class Supermercado {
    String nome;
    String cnpj;
    String endereco;
    String numTelefone;

    Produto [] produtos = new Produto[30];
    Produto produto_caro = new Produto();
    Produto produto_barato = new Produto();

    void addProduto(Produto novoproduto){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){
                produtos[i] = novoproduto;
                break;
            }
        }
    }
    void mostrarMaisCaroBarato() {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                produto_caro.valor = 0;
                produto_barato.valor = 1000;

                if (produto_barato.valor < produtos[i].valor) {
                    produto_barato = produtos[i];
                }
                if (produto_caro.valor > produtos[i].valor) {
                    produto_caro = produtos[i];
                }
            }
        }
        System.out.println("Produto mais barato:");
        produto_barato.mostrarInfos();
        System.out.println("Produto mais caro:");
        produto_caro.mostrarInfos();
    }
    void contarCategorias(){
        int hig = 0;
        int ut = 0;
        int sd = 0;

        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null){


                if(produtos[i].categoria == "Higiene"){
                    hig++;

                }
                if(produtos[i].categoria == "Saúde"){
                    sd++;
                }
                if(produtos[i].categoria == "Utensílios"){
                    ut++;

                }
            }

        }

        System.out.println("Produtos de higiene: " + hig);
        System.out.println("Produtos de saúde: "+ sd);
        System.out.println("Produtos de utensílios: " + ut);
        }


    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Telefone: " + numTelefone);
        System.out.println("Endereço: " + endereco);


    }

}
