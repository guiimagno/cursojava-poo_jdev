package cursojava.util;

import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso acesso;

    public boolean autenticar(){
        return acesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
    this.acesso = acesso;
    }
}
