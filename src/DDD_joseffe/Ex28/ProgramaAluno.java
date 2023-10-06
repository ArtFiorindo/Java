package DDD_joseffe.Ex28;

import DDD_joseffe.Ex27.Produto;

import java.util.Objects;
import java.util.Scanner;

public class ProgramaAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluno[] listaAlunos = new Aluno[5];

        for (int i = 0; i<=4; i++) {
            Aluno c = new Aluno();

            System.out.printf("Digite o RA do aluno: ");
            c.ra = ler.next();

            System.out.printf("Digite o Nome do aluno: ");
            c.nome = ler.next();

                String[] materias = new String[10];

                c.materias = materias;
                for (int m =0; m<=6; m++) {
                System.out.printf("Digite a Sigla/Inicial da sua %dº Matéria: ", m);
                c.materias[m] = ler.next();
                }

            System.out.printf("Digite o periodo cursado pelo o aluno: ");
            c.periodo = ler.next();

            listaAlunos[i] = c;

        }

        for (int i = 0; i<=4; i++){
            if (listaAlunos[i].periodo.equalsIgnoreCase("noite")){
                System.out.printf("Nome dos alunos da Noite: %s\n", listaAlunos[i].nome);

            }
        }
    }
}
