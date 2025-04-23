import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela extends JFrame {
    private JPanel painel;

    public Tela() {
        painel = new JPanel();
    }

    public void configuraJanela() {
        setVisible(true);
        setTitle("Aula 02 - Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setResizable(false);
        configurarPainel();
        add(painel); 
    }

    public void configurarPainel() {
        painel.setBackground(Color.MAGENTA);
        painel.setLayout(null);
    }
}