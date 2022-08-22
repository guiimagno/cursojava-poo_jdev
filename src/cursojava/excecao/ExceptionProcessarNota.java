package cursojava.excecao;

public class ExceptionProcessarNota extends  Exception{
    public ExceptionProcessarNota(String erro) {
        super("erro no processamento do arquivo"+erro);
    }
}
