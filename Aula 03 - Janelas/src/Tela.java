import javax.swing.*;

public class Tela extends JFrame {
    private JPanel painel;
    private JRadioButton jrbFem, jrbMasc;
    private JCheckBox jckPop, jckRock;
    private JLabel jlSexo, jlEstilo;
    private ButtonGroup grupoSexo;
    private JButton jbImprimir;


    // private JButton jbFechar, jbCalcular;
    // private JLabel jlAnoNascimento;
    // private JTextField jtxAnoNascimento;

    public Tela() {
        painel = new JPanel();
        jrbFem = new JRadioButton("Feminino");
        jrbMasc = new JRadioButton("Masculino");
        jckPop = new JCheckBox("Pop");
        jckRock = new JCheckBox("Rock");
        jlSexo = new JLabel("Sexo: ");
        jlEstilo = new JLabel("Estilo Musical");
        grupoSexo = new ButtonGroup();
        jbImprimir = new JButton("Imprimir");
        // jbFechar = new JButton("Fechar");
        // jbCalcular = new JButton("Calcular");
        // jlAnoNascimento = new JLabel(("Ano de Nascimento: "));
        // jtxAnoNascimento = new JTextField();
    }

    public void configuraJanela() {
        setTitle("Aula 03 - Botões");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        configurarPainel();
        add(painel); 
        setVisible(true);
    }

    public void configurarPainel() {
        // painel.setBackground(Color.MAGENTA);
        // painel.setLayout(null);
        grupoSexo.add(jrbFem);
        grupoSexo.add(jrbMasc);

        painel.add(jlSexo);
        painel.add(jrbFem);
        painel.add(jrbMasc);
        painel.add(jlEstilo);
        painel.add(jckRock);
        painel.add(jckPop);
        painel.add(jbImprimir);

        jbImprimir.addActionListener(evento ->{
            String retorno = "Sexo: ";
            if (jrbFem.isSelected()){
            retorno +="Feminino\n";
            }
            else if (jrbMasc.isSelected()){
                retorno +="Masculino\n";
            }
            retorno+="Estilo Musical: ";
            if (jckPop.isSelected()){
                retorno +="Pop\n";
            }
            if (jckRock.isSelected()){
                retorno +="Rock\n";
            }
            JOptionPane.showMessageDialog(this, retorno, "Retorno Sistema", JOptionPane.PLAIN_MESSAGE);
        });
    }

    // @Override
    // public void actionPerformed(ActionEvent evento) {
    //     if (evento.getSource() == jbTeste){
    //         JOptionPane.showMessageDialog(this, "AQUI É GALO!");
    //     }
    // }
}