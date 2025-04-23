import javax.swing.JFrame;

public class MinhaPrimeiraTela {
    public JFrame janela;
    public MinhaPrimeiraTela(){
        janela = new JFrame();
    }
    public void configuraJanela(){
        janela.setVisible(true);
        janela.setTitle("Minha Primeira Janela");
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setResizable(false);
        janela.setLocation(300,300);
    }
}
