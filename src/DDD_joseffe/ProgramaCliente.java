package DDD_joseffe;

import java.util.Scanner;

public class ProgramaCliente {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Cliente[] listaCliente = new Cliente[10];

        for (int i = 0; i<=2; i++) {
            Cliente a = new Cliente();

            System.out.printf("Digite o nome da %d° pessoa: ", i+1);
            a.nome = ler.next();

            System.out.printf("Digite a idade da %d° pessoa: ", i+1);
            a.idade = ler.nextInt();

            System.out.printf("Digite o e-mail da %d° pessoa: ", i+1);
            a.email = ler.next();

            listaCliente[i] = a;
        }

        for (int i=0; i<=2; i++) {
            System.out.println(listaCliente[i].nome);
        }

        ler.close();
    }


}

}
