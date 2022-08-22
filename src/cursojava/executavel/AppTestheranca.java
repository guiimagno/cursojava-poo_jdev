package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class AppTestheranca {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Guilherme");
        aluno.setSerieMatricula("3ª ano");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setNome("Elizabete");
        diretor.setRegristroEducacao("1j23g23621u3");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setNome("Marcello");
        secretario.setNivelCargo("Sênior");
        secretario.setIdade(30);

        System.out.println(aluno.msgPessoaMaiorIdade() + "- "+  aluno.maiorDeIdade());
        System.out.println(diretor.maiorDeIdade());
        System.out.println(secretario.maiorDeIdade());

        System.out.println("Salário do aluno: " + aluno.salario());
        System.out.println("Salário do diretor: " + diretor.salario());
        System.out.println("Salário do secretário: " + secretario.salario());

        Pessoa pessoa = new Aluno();

    }
}
