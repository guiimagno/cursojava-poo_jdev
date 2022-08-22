package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExceptionProcessarNota;
import cursojava.util.FuncaoAutenticacao;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {

            lerArquivo();

            String login = JOptionPane.showInputDialog("Informe o login: ");
            String senha = JOptionPane.showInputDialog("Informe a senha: ");

            if (new FuncaoAutenticacao(new Secretario(login, senha)).autenticar()) {
//        if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

                List<Aluno> alunos = new ArrayList<Aluno>();

                HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

//        List<Aluno> alunosAprovados = new ArrayList<Aluno>();
//        List<Aluno> alunosReprovados = new ArrayList<Aluno>();
//        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();

                for (int qtd = 0; qtd <= 1; qtd++) {

                    String nome = JOptionPane.showInputDialog("Nome do aluno(a): " + qtd);
                    String idade = JOptionPane.showInputDialog("Idade: ");
       /* String dataNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
        String rg = JOptionPane.showInputDialog("Registro Geral-RG: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String mae = JOptionPane.showInputDialog("Mãe do aluno(a): ");
        String pai = JOptionPane.showInputDialog("Pai do aluno(a): ");
        String matricula = JOptionPane.showInputDialog("Data da matricula: ");
        String serie = JOptionPane.showInputDialog("Série: ");
        String escola = JOptionPane.showInputDialog("Nome da escola: "); */

                    Aluno aluno = new Aluno();

                    aluno.setNome(nome);
                    aluno.setIdade(Integer.valueOf(idade));
    /*     aluno.setDataNascimento(dataNascimento);
        aluno.setRg(rg);
        aluno.setCpf(cpf);
        aluno.setNomeMae(mae);
        aluno.setNomePai(pai);
        aluno.setDataMatricula(matricula);
        aluno.setSerieMatricula(serie);
        aluno.setNomeEscola(escola);*/

                    for (int posicao = 1; posicao <= 1; posicao++) {
                        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + posicao);
                        String notaDisciplina = JOptionPane.showInputDialog(" Nota: " + posicao);

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina(nomeDisciplina);
//                        disciplina.setNota(Double.valueOf(notaDisciplina));

                        aluno.getDisciplinas().add(disciplina);
                    }

                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

                    if (escolha == 0) {

                        int continuarRemocao = 0;
                        int posicao = 1;

                        while (continuarRemocao == 0) {
                            String removeDisciplina = JOptionPane.showInputDialog("Qual disciplina deseja remover? 1, 2, 3 ou 4:  ");
                            aluno.getDisciplinas().remove(Integer.valueOf(removeDisciplina).intValue() - posicao);
                            posicao++;
                            continuarRemocao = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                        }
                    }

                    alunos.add(aluno);
                }

                maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

                for (Aluno aluno : alunos) {
                    if (aluno.alunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                    } else if (aluno.alunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                    } else {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    }
                }

                System.out.println("----- LISTA DOS APROVADOS -----");
                for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                    System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
                }

                System.out.println("----- LISTA DOS REPROVADOS -----");
                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
                }

                System.out.println("----- LISTA DE RECUPERACAO -----");
                for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                    System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.alunoAprovado2() + " com média de: " + aluno.mediaNota());
                }

//        for (int pos=0; pos < alunos.size(); pos++){
//            Aluno aluno = alunos.get(pos);
//
//            if (aluno.getNome().equalsIgnoreCase("Gui")){
//                Aluno trocar = new Aluno();
//                trocar.setNome("Aluno foi trocado");
//
//                Disciplina disciplina = new Disciplina();
//                disciplina.setDisciplina("Matematica");
//                disciplina.setNota(98);
//
//                trocar.getDisciplina().add(disciplina);
//
//                alunos.set(pos, trocar);
//                aluno = alunos.get(pos);
//            }
//
//            System.out.println("Aluno = "+ aluno);
//            System.out.println("Media do aluno = "+aluno.mediaNota());
//            System.out.println("Resultado = "+ aluno.alunoAprovado2());
//            System.out.println("----------------------");
//
//            for (int posd=0; posd < aluno.getDisciplina().size(); posd++){
//                Disciplina disciplina = aluno.getDisciplina().get(posd);
//                System.out.println("DISCIPLINA: "+disciplina.getDisciplina() + "NOTA: "+ disciplina.getNota());
//            }
//        }

//        for (Aluno aluno : alunos) {
//            if (aluno.getNome().equalsIgnoreCase("Guilherme")){
//
//                alunos.remove(aluno);
//                break;
//            } else {
//                System.out.println("média do aluno: " + aluno.mediaNota());
//                System.out.println("Resultado: " + aluno.alunoAprovado2());
//                System.out.println("----------------------------------------------------------");
//                System.out.println(aluno);
//            }
//        }

//        for (Aluno aluno : alunos){
//            System.out.println("Alunos que sobraram na lista: ");
//            System.out.println(aluno.getNome());
//            System.out.println("Suas materias são: ");
//
//            for(Disciplina disciplina : aluno.getDisciplina()){
//                System.out.println(disciplina.getDisciplina());
//            }
//        }
            } else {
                JOptionPane.showMessageDialog(null, "Acesso não permitido!");
            }
        } catch (Exception e) {
            StringBuilder saida = new StringBuilder();
            e.printStackTrace();

            for (int i = 0; i < e.getStackTrace().length; i++) {
                saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
                saida.append("\nMétodo de erro: " + e.getStackTrace()[i].getMethodName());
                saida.append("\nArquivo de erro: " + e.getStackTrace()[i].getFileName());
                saida.append("\nLinha do erro: " + e.getStackTrace()[i].getLineNumber());

            }

            JOptionPane.showMessageDialog(null, "Erro conversão de numero" + saida.toString());

        } finally {
            JOptionPane.showMessageDialog(null, "Obrigado por aprender JAVA comigo!");
        }
    }

    public static void lerArquivo() throws ExceptionProcessarNota {
        try {
            File file = new File("c://arquivo.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new ExceptionProcessarNota(e.getMessage());
        }
    }
}
