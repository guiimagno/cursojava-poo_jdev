package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {

    private double[] nota = new double[4];
    private String disciplina;

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMediaNotas() {
        double somaTotal = 0;
        for (int pos = 0; pos < nota.length; pos++) {

            somaTotal+= nota[pos];
        }
        return somaTotal / 4;
    }
//    public Disciplina(double nota, String disciplina) {
//        this.nota = nota;
//        this.disciplina = disciplina;
//    }

}
