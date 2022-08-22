package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


        Aluno aluno = new Aluno();
        aluno.setNome("Guilherme");
        aluno.setIdade(31);
        aluno.setDataNascimento("19-08-1991");
        aluno.setRg("098763212");
        aluno.setCpf("123454566");
        aluno.setNomeMae("Cris");
        aluno.setNomePai("Gerilson");
        aluno.setDataMatricula("00-00-000");
        aluno.setSerieMatricula("3ª ano");

        alunos.add(aluno);

        System.out.println(aluno);



//
//        maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
//        maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
//        maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
//
//        for (Aluno aluno : alunos) {
//            if (aluno.alunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
//                maps.get(StatusAluno.APROVADO).add(aluno);
//            } else if (aluno.alunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
//                maps.get(StatusAluno.RECUPERACAO).add(aluno);
//            } else {
//                maps.get(StatusAluno.REPROVADO).add(aluno);
//            }
//        }

//        System.out.println("----- LISTA DOS APROVADOS -----");
//        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
//            System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
//        }
//
//        System.out.println("----- LISTA DOS REPROVADOS -----");
//        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
//            System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
//        }
//
//        System.out.println("----- LISTA DE RECUPERACAO -----");
//        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
//            System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
//        }
    }
}
