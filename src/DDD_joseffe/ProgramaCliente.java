package DDD_joseffe;

import java.util.Scanner;

public class ProgramaCliente {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] listaCliente = new Cliente[10];

        for (int i = 0; i<=4; i++) {
            Cliente a = new Cliente();

            System.out.printf("Digite o seu ID: ");
            a.id = ler.nextInt();

            System.out.printf("Digite o seu nome : ");
            a.nome = ler.next();

            System.out.printf("Digite a sua idade: ");
            a.idade = ler.nextInt();

            System.out.printf("Digite o seu e-mail: ");
            a.email = ler.next();

            listaCliente[i] = a;
        }


        for (int i=0; i<=4; i++) {
            System.out.println(listaCliente[i].nome);
        }



        ler.close();
    }


}


