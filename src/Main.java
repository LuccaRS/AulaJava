import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Supermercado supermercado = new Supermercado();

        Scanner sc = new Scanner(System.in);

        supermercado.nome = "Mercadinho do Tião";
        supermercado.numTelefone = "3532911447";
        supermercado.cnpj = "123345678";
        supermercado.endereco = "Rua dos Alfineiros";

        boolean saida = true;

        System.out.println("Bem vindo ao menu de criacao do supermercado");

        while(saida){
            System.out.println(" 1: Adicionar algum produto");
            System.out.println(" 2: Mostrar informações do supermercado e do produto");
            System.out.println(" 3: Mostrar a quantidade de produtos de cada categoria disponível");
            System.out.println(" 4: Mostrar produto mais caro e mais barato do estoque");
            System.out.println(" 5: Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op)
            {

                // Adiciona produto no mercado
                case 1:
                    Produto produtos = new Produto();
                    System.out.println("Nome do Produto");
                    produtos.nome = sc.nextLine();
                    System.out.println("Categoria do produto");
                    produtos.categoria = sc.nextLine();
                    System.out.println("Código da série");
                    produtos.codigoSerie = sc.nextInt();
                    System.out.println("Quantidade");
                    produtos.quantidade = sc.nextInt();
                    System.out.println("Valor do produto");
                    produtos.valor = sc.nextDouble();

                    supermercado.addProduto(produtos);
                    break;

                // Mostra as infos do super e do produto
                case 2:
                    System.out.println("Informações do supermercado:");
                    supermercado.mostrarInfo();
                    System.out.println("Informações dos produtos:");
                    //produtos.mostrarInfos();

                    break;

                // Mostra a qte. de produtos de cada categoria (Higiene, utensilios e alimenticios)
                case 3:
                    supermercado.contarCategorias();
                    break;

                // Mostra as informacoes do produto mais caro e mais barato
                case 4:
                    supermercado.mostrarMaisCaroBarato();

                    break;
                // Sair do menu
                case 5:
                    saida = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }

        }
    }
