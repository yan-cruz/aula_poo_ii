import javax.swing.*;

public class Tela extends JFrame {
    private JPanel painel;
    private JTextArea jtxaObservacao;
    private JScrollPane jspObservacao;
    private JButton jbImprimir;

    public Tela() {
        painel = new JPanel();
        jtxaObservacao = new JTextArea();
        jspObservacao = new JScrollPane(jtxaObservacao);
        jbImprimir = new JButton("Imprimir");
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
        painel.setLayout(null);
        jspObservacao.setBounds(50, 100, 100, 100);
        painel.add(jspObservacao);

        jbImprimir.setBounds(50, 250, 70, 30);
        jbImprimir.addActionListener(e -> {
            String texto = jtxaObservacao.getText();
            JOptionPane.showMessageDialog(this, texto);
        });
        painel.add(jbImprimir);
    }
}