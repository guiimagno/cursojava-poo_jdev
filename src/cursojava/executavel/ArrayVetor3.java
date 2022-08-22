package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor3 {
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

        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;

        for (int pos =0; pos < arrayAlunos.length; pos++) {
            System.out.println("Nome: "+arrayAlunos[pos].getNome());

            for(Disciplina d: arrayAlunos[pos].getDisciplinas()){
                System.out.println("Disciplina: "+ d.getDisciplina());

                for (int posNota=0; posNota < d.getNota().length; posNota++){
                    System.out.println("Nota "+(posNota+1)+": "+ d.getNota()[posNota]);
                }
            }
        }
    }
}
