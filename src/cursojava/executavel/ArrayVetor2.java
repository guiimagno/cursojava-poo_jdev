package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor2 {
    public static void main(String[] args) {
        double[] notasBancoDeDados = {5.2, 2.2, 7.2, 6.5};
        double[] notasLogica = {9.2, 8.2, 9.2, 5.5};

        Aluno aluno = new Aluno();
        aluno.setNome("Guilherme");
        aluno.setDataMatricula("10-00-000");

        Disciplina d1 = new Disciplina();
        d1.setDisciplina("Banco de dados");
        d1.setNota(notasBancoDeDados);
        aluno.getDisciplinas().add(d1);

        Disciplina d2 = new Disciplina();
        d2.setDisciplina("Lógica de programação");
        d2.setNota(notasLogica);
        aluno.getDisciplinas().add(d2);

        System.out.println("Nome do aluno = " + aluno.getNome() + "Inscrito no curso de Java");

        for (Disciplina d : aluno.getDisciplinas()) {

            System.out.println();
            System.out.println("--------- DISCIPLINA DO ALUNO ---------");
            System.out.println("DISCIPLINA = " + d.getDisciplina());

            double notaMax = 0.0;
            for (int pos = 0; pos < d.getNota().length; pos++) {

                System.out.println("NOTA = " + (pos + 1) + " -> " + d.getNota()[pos]);
                if (pos == 0) {
                    notaMax = d.getNota()[pos];
                } else {
                    if (d.getNota()[pos] > notaMax) {
                        notaMax = d.getNota()[pos];
                    }
                }
            }
            System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " = " + notaMax);
        }
    }
}
