package DDD_joseffe;

import java.util.Scanner;

public class ProgramaCliente {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] listaCliente = new Cliente[5];

        for (int i = 0; i<=4; i++) {
            Cliente a = new Cliente();

            System.out.printf("%dºDigite o seu ID: ", i+1);
            a.id = ler.nextInt();

            System.out.printf("%dº Digite o seu nome : ", i+1);
            a.nome = ler.next();

            System.out.printf("%dº Digite a sua idade: ", i+1);
            a.idade = ler.nextInt();

            System.out.printf("%dº Digite o seu e-mail: ", i+1);
            a.email = ler.next();

            listaCliente[i] = a;
        }


        for (int i=0; i<=4; i++) {
            if (listaCliente[i].idade>=18) {
                System.out.printf("Nome: %s", listaCliente[i].nome);
            }
        }




        ler.close();
    }


}


