package cursojava.thread;

import javax.swing.*;
import java.awt.*;

public class ShowTimeThread  extends JDialog {

    public ShowTimeThread(){ // executa o que estiver dentro no momento da abertura ou execução
        setTitle("Time com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);

        


        setVisible(true); // torna a tela visível para o usuário - sempre será o último comando
    }
}
