package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    private String dataMatricula;
    private String serieMatricula;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();



    public Aluno() {  /* cria os dados na memória - sendo padrão do java */ }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    // SET - adiciona ou recebe dados para os atributos
    // GET - resgara ou obtém o valor do atributo


    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSerieMatricula() {
        return serieMatricula;
    }

    public void setSerieMatricula(String serieMatricula) {
        this.serieMatricula = serieMatricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public double salario() {
        return 1500.90;
    }

    public double mediaNota(){
        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas){
            somaNotas += disciplina.getMediaNotas();

        }
        return somaNotas / disciplinas.size();
    }

    public boolean alunoAprovado() {
        double media = this.mediaNota();
        if (media >= 70) {
            return true;
        } else {
            return false;
        }
    }

    public String alunoAprovado2() {
        double media = this.mediaNota();
        if (media >= 50) {
            if (media >= 70){
                return StatusAluno.APROVADO;
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", serieMatricula='" + serieMatricula + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean maiorDeIdade() {
        return super.maiorDeIdade();
    }

    public String msgPessoaMaiorIdade(){
        return this.maiorDeIdade() ? "MAIOR DE IDADE" : "MENOR DE IDADE";
    }
}
