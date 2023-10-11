package DDD_joseffe.Ex29;

import java.util.Scanner;

public class ProgramaBanco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente[] listaCliente = new Cliente[5];
        int id;
        String nome;
        int idade;
        String email;
        char possuiConta;
        String agenciaConta;
        String agenciaNumero;
        double agenciaSaldo;


        for (int i = 0; i <= 4; i++) {

            Cliente p;

            System.out.printf("Digite o seu id: ");
            id = ler.nextInt();

            System.out.printf("Digite o seu nome: ");
            nome = ler.next();

            System.out.printf("Digite a sua idade: ");
            idade = ler.nextInt();

            System.out.printf("Digite o email: ");
            email = ler.next();

            System.out.printf("Possui uma Conta? (S/N)");
            possuiConta = ler.next().charAt(0);

            if (possuiConta == 'S') {
                System.out.printf("Digite a agencia da conta: ");
                agenciaConta = ler.next();

                System.out.printf("Digite o numero da conta: ");
                agenciaNumero = ler.next();

                System.out.printf("Digite o saldo da conta: ");
                agenciaSaldo = ler.nextDouble();

                ContaBancaria c = new ContaBancaria(agenciaConta, agenciaNumero, agenciaSaldo);

                p = new Cliente(id, nome, idade, email, c);}
            else {
                p = new Cliente(id, nome, idade, email, null);
            }

            listaCliente[i] = p;
        }
        for (int i = 0; i <= 4; i++) {
            System.out.printf(listaCliente[i].exibirNomeIdade());

            if (listaCliente[i].conta != null) {
                System.out.printf("\n Conta: %s",  listaCliente[i].exibirDadosConta());
            }


        }
    }
}

