import javax.swing.*;

public class Tela7 extends JFrame {
    private JPanel painel;
    private JComboBox jcbEstados;
    private JLabel jlEstados;
    private JButton jbBotao1, jbBotao2;


    public Tela7() {
        painel = new JPanel();
        jcbEstados = new JComboBox(new String []{ "MG", "SP", "RJ", "BA" });
        jlEstados = new JLabel("Selecione o Estado: ");
        jbBotao2 = new JButton("Adicionar");
        jbBotao1 = new JButton("Imprimir");
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

        jlEstados.setBounds(200, 75, 200, 30);
        painel.add(jlEstados);

        jcbEstados.setBounds(200, 100, 200, 30);
        painel.add(jcbEstados);

        jbBotao1.setBounds(50, 200, 200, 30);
        jbBotao1.addActionListener(evento -> {
            String estado = jcbEstados.getSelectedItem().toString();
            int indice = jcbEstados.getSelectedIndex();
            JOptionPane.showMessageDialog(this, "O indice selecionado:" + indice + "\nCorresponde ao: " + estado);
        });
        painel.add(jbBotao1);

        jbBotao2.setBounds(300, 200, 200, 30);
        jbBotao2.addActionListener(evento ->{
            String estado = JOptionPane.showInputDialog(this, "Digite um estado");
            jcbEstados.addItem(estado);
        });
        painel.add(jbBotao2);
    }
}