package application;

import java.util.Scanner;

public class Program {

    static int x = 3;
    static int y = 3;
    static int z = 3;

    static int[][][] estoque = new int[x][y][z];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n+--------- Menu ----------+");
            System.out.println("|1- Adicionar Produto     |");
            System.out.println("|2- Remover Produto       |");
            System.out.println("|3- Verificar produto     |");
            System.out.println("|4- Mostrar estoque       |");
            System.out.println("|5- Sair                  |");
            System.out.println("+-------------------------+");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    addEstoque(sc);
                    break;
                case 2:
                    removeEstoque(sc);
                    break;
                case 3:
                    verificarEstoque(sc);
                    break;
                case 4:
                    listaEstoque(sc);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }

    public static void addEstoque(Scanner sc) {

        System.out.print("+-------------------------+\n");
        System.out.print("Id: ");
        int id = sc.nextInt();

        System.out.print("+-------------------------+\n");
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        // mudar o 3
        for (int n = 0; n < quantidade; n++) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (estoque[i][j][k] == 0) {
                            estoque[i][j][k] = id;
                            System.out.print("+-------------------------------------+\n");
                            System.out.printf("Produto adicionado na posição [%d][%d][%d]\n", i, j, k);
                            quantidade--;
                            if (quantidade == 0) {
                                return;
                            } // Sai do loop após adicionar o produto
                        }

                    }
                }
            }
        }

    }

    public static void removeEstoque(Scanner sc) {
        System.out.print("Id: ");
        int id = sc.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        // mudar o 3
        for (int n = 0; n < quantidade; n++) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        // System.out.printf("posição [%d][%d][%d]\n", i, j, k);
                        // System.out.println("Produto: " + estoque[i][j][k]);
                        if (estoque[i][j][k] == id) {
                            estoque[i][j][k] = 0;
                            System.out.print("+-----------------------------------+\n");
                            System.out.printf("Produto removido da posição [%d][%d][%d]\n", i, j, k);
                            System.out.print("+-----------------------------------+\n");
                            quantidade--;
                            if (quantidade == 0) {
                                return; // Sai do loop após adicionar o produto
                            }
                        } else if (estoque[i][j][k] == id && estoque[i][j][k] == 0) {
                            System.out.print("+-----------------------------------+\n");
                            System.out.println("Produto não encontrado no estoque.");
                            return; // Sai do loop após adicionar o produto
                        }

                    }
                }
            }
        }

    }

    public static void listaEstoque(Scanner sc) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    System.out.printf("posição [%d][%d][%d]\n", i, j, k);
                    System.out.println("Produto: " + estoque[i][j][k]);



                }
            }
        }

    }

    public static void verificarEstoque(Scanner sc) {
    System.out.print("+-----------------------------------+\n");
    System.out.println("Id: ");
    System.out.print("+-----------------------------------+\n");
    int id = sc.nextInt();

    boolean encontrado = false;
    int quantidade = 0; // Variável para contar a quantidade de produtos com o mesmo ID

    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            for (int k = 0; k < z; k++) {
                if (estoque[i][j][k] == id) {
                    System.out.print("+-----------------------------------+\n");
                    System.out.printf("Produto encontrado na posição [%d][%d][%d]\n", i, j, k);
                    System.out.print("+-----------------------------------+\n");
                    encontrado = true;
                    quantidade++; // Incrementa o contador
                }
            }
        }
    }

    if (encontrado) {
        System.out.print("+-----------------------------------+\n");
        System.out.printf("Quantidade de produtos com ID %d: %d\n", id, quantidade);
        System.out.print("+-----------------------------------+\n");
    } else {
        System.out.print("+-----------------------------------+\n");
        System.out.println("Produto não encontrado no estoque.");
        System.out.print("+-----------------------------------+\n");
}


}

}