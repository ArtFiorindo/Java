package DDD_joseffe.Ex27;

import DDD_joseffe.Cliente;

import java.util.Scanner;

public class ProgramaProduto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Produto[] listaProduto = new Produto[10];

        for (int i = 0; i<=9; i++){
            Produto b = new Produto();

            System.out.printf("Digite o ID do produto: ");
            b.id = ler.nextInt();

            System.out.printf("Digite a descrição do produto: ");
            b.descricao = ler.next();

            System.out.printf("Digite o valor do produto: ");
            b.valor = ler.nextDouble();

            System.out.printf("Digite a quantidade de produto: ");
            b.quantidade = ler.nextDouble();

            listaProduto[i] = b;

        }
        for (int i = 0; i<=9; i++){
            if (listaProduto[i].valor<=100){
                System.out.printf("ID dos produtos de valor abaixo de 100: %s\n", listaProduto[i].id);

            }
        }

    }
}
